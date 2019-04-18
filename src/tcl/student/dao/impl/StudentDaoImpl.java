package tcl.student.dao.impl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tcl.student.dao.StudentDao;
import tcl.student.impl.Student;

public class StudentDaoImpl implements StudentDao {
	public static  boolean flag=false;
	private PrintWriter out;
	private BufferedReader in;
	@Override
	public boolean addStudent(Student stu) {
		try {
			out=new PrintWriter(new OutputStreamWriter(new FileOutputStream("data/student.txt",true),"GBK"));
			out.println(stu.getStringstudent());
			out.flush();
			return true;
		} catch (UnsupportedEncodingException | FileNotFoundException e) {

			return false;
		} finally{
			if(out!=null)out.close();
		}		
	}

	@Override
	public List<Student> showAllStudent() {
		// TODO Auto-generated method stub
		try {
			in=new BufferedReader(new FileReader("data/student.txt"));
			String str="";
			List<Student>list=new ArrayList<Student>();
			while((str=in.readLine())!=null){				
				String result[]=str.split("#");
				list.add(new Student(Integer.parseInt(result[0]), result[1], Double.parseDouble(result[2]))) ;
			}
			return list;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{

			try {
				if(in!=null)in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{

				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public Student showStudentByid(int id) {
		// TODO Auto-generated method stub
		List<Student>list=showAllStudent();
		for (Student stu : list) {
			if(id==stu.getId()){
				flag=true;
				return stu;
			}
		}
		return null;
	}

	@Override
	public boolean removeStudent(int id) {
		// TODO Auto-generated method stub
   
		List<Student>list=showAllStudent();	
		Iterator<Student>it=list.iterator();
		while(it.hasNext()){
			Student stu=it.next();
			if(stu.getId()==id){
				it.remove();
			}
		}
		
		File file=new File("data/student.txt");
		if(file.exists()){
			file.delete();
		}
		for (Student s : list) {
		  addStudent(s);
		}
        return true;
	}

}
