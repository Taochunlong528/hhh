package tcl.student.view;

import java.util.List;

import tcl.student.biz.StudentBiz;
import tcl.student.biz.impl.StudentBizImpl;
import tcl.student.impl.Student;

public class View {
       public void welcome(){
    	   System.out.println("简易学生管理系统");
    	   System.out.println("=============================");
    	   System.out.println("\t1、录入学生成绩");
    	   System.out.println("\t2、显示学生成绩");
    	   System.out.println("\t3、学生信息排序");
    	   System.out.println("\t4、删除学生信息");
    	   System.out.println("\t0、退出系统");
    	   System.out.println("-----------------------------");
       }
      public void print(String msg){
    	  System.out.println(msg);
      }
      public void showStudent(){
    	  System.out.println("----------------------------");
    	  System.out.println("\t学号\t姓名\t成绩");
    	  System.out.println("----------------------------");
    	  StudentBiz sb=new StudentBizImpl();
    	  List<Student>list=sb.showAll();
    	  for (Student student : list) {
		  System.out.println(student);
		}    	    	    	  
      }
      public void arryShow(){
    	  System.out.println("学生成绩排序");
    	  System.out.println("--------------------");
    	  System.out.println("1、升序");
    	  System.out.println("2、降序");
    	  System.out.println("--------------------");
      }
   
}
