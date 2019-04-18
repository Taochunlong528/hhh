package tcl.student.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tcl.student.Student;
import tcl.student.dao.StudentDao;

public class StudentDaoImol implements StudentDao {
	BufferedReader in;
	PrintWriter out;

	@Override
	public boolean addStudent(Student stu) {
		// TODO Auto-generated method stub
		try {
			out=new PrintWriter(new OutputStreamWriter(new FileOutputStream("data/stu.txt",true),"GBK"));
			String str=stu.show();
			out.println(str);		    
			out.flush();
			return true;
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
		return false;
	}

	@Override
	public List<Student> showAllstudent() {
		// TODO Auto-generated method stub
		try {
			in=new BufferedReader(new InputStreamReader(new FileInputStream("data/stu.txt"), "GBK"));
			String str="";
			List<Student>list=new ArrayList<Student>();
			while((str=in.readLine())!=null){
				String result[]=str.split("#");
				list.add(new Student(Integer.parseInt(result[0]), result[1], Double.parseDouble(result[2])));
			}
			return list;
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student findStudentByid(int id) {
		List<Student>list=new ArrayList<Student>();
		list=this.showAllstudent();
		for (Student student : list) {
			if(id==student.getId()){
				return student;
			}
		}
		return null;
	}

	@Override
	public boolean removeStudent(int id) {
		// TODO Auto-generated method stub
		List<Student>list=this.showAllstudent();
		
		Iterator<Student>it=list.iterator();
		while(it.hasNext()){
			Student stu=it.next();
			if(stu.getId()==id){
				it.remove();
			}
		}
		
		File file=new File("data/stu.txt");
		if(file.exists()){
			System.out.println("shanchuwenjian");
			file.delete();
		}
		//		for (Student student : list) {
		//			addStudent(student);
		//		}		
		return true;
	}

}
