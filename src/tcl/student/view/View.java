package tcl.student.view;

import java.util.List;

import tcl.student.biz.StudentBiz;
import tcl.student.biz.impl.StudentBizImpl;
import tcl.student.impl.Student;

public class View {
       public void welcome(){
    	   System.out.println("����ѧ������ϵͳ");
    	   System.out.println("=============================");
    	   System.out.println("\t1��¼��ѧ���ɼ�");
    	   System.out.println("\t2����ʾѧ���ɼ�");
    	   System.out.println("\t3��ѧ����Ϣ����");
    	   System.out.println("\t4��ɾ��ѧ����Ϣ");
    	   System.out.println("\t0���˳�ϵͳ");
    	   System.out.println("-----------------------------");
       }
      public void print(String msg){
    	  System.out.println(msg);
      }
      public void showStudent(){
    	  System.out.println("----------------------------");
    	  System.out.println("\tѧ��\t����\t�ɼ�");
    	  System.out.println("----------------------------");
    	  StudentBiz sb=new StudentBizImpl();
    	  List<Student>list=sb.showAll();
    	  for (Student student : list) {
		  System.out.println(student);
		}    	    	    	  
      }
      public void arryShow(){
    	  System.out.println("ѧ���ɼ�����");
    	  System.out.println("--------------------");
    	  System.out.println("1������");
    	  System.out.println("2������");
    	  System.out.println("--------------------");
      }
   
}
