package tcl.student.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tcl.student.Student;
import tcl.student.biz.StudentBiz;
import tcl.student.biz.StudentBizImpl;

public class MyTest {
	private  StudentBiz sbiz=new StudentBizImpl();
	@Test
	public void add(){
		String str=sbiz.add(2, "ÀîËÄ", 90.0);
		System.out.println(str);
	}
	@Test
	public void show(){
		List<Student> list=new ArrayList<Student>();
		list=sbiz.shoAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void Array(){
		List<Student> list=new ArrayList<Student>();
		list=sbiz.showArray(false);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void delect(){

        String  b=sbiz.delect(1);
        System.out.println(b);
		
	}
}
