/*package tcl.student.test;
import java.util.List;
import org.junit.Test;
import tcl.student.biz.StudentBiz;
import tcl.student.biz.impl.StudentBizImpl;
import tcl.student.impl.Student;
public class Mytest {	 
	@Test
    public void add(){
		StudentBiz sb=new StudentBizImpl();
    	String msg=sb.add(7, "Ð¡Íõ°Ë", 50.0);
    	System.out.println(msg);
    }
	@Test
	public void showAll(){
		StudentBiz sb=new StudentBizImpl();
		List<Student>list= sb.showAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void arry(){
		StudentBiz sb=new StudentBizImpl();
		List<Student>list=sb.showArray();
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
	@Test
	public void remove(){
		StudentBiz sb=new StudentBizImpl();
		String msg=sb.delect(2);
		System.out.println(msg);
		
		
	}
}
*/