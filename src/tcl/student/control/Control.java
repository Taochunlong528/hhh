package tcl.student.control;

import java.util.List;
import java.util.Scanner;
import tcl.student.biz.StudentBiz;
import tcl.student.biz.impl.StudentBizImpl;
import tcl.student.impl.Student;
import tcl.student.util.UserInput;
import tcl.student.view.View;
public class Control {
	Scanner sc=new Scanner(System.in);
	private View view;
	private StudentBiz sbiz;
	private Student stu;
	private UserInput use;

	public Control() {
		this.view = new View();
		this.sbiz=new StudentBizImpl();
		this.stu=new Student();
	}
	public void start(){
		view.welcome();
		view.print("请选择：");
		int select=sc.nextInt();
		while(true){
			if(select==1){
				System.out.println(">>>学生信息录入:");
				this.addShow();
//				System.out.println("是否继续y/n");
//				String s=sc.next();
				String s=use.getString("是否继续y/n");
				if(s.equals("y")){
					this.addShow();
				}else{
					this.start();
				}          
			}else if(select==2){
				this.scoreShow();
				this.start();
			}else if(select==3){
				this.arryShow();
				int n=sc.nextInt();
				if(n==1){				
					List<Student>list=sbiz.showArray(true);
					for (Student stu : list) {
						System.out.println(stu);
					}
					this.start();
				}else if(n==2){
					List<Student>list=sbiz.showArray(false);
					for (Student stu : list) {
						System.out.println(stu);
					}
				}else{
					System.out.println("输入错误，请重新输入");
					this.arryShow();
				}
				this.start();
			}else if(select==4){
				this.delectShow();
				int id=sc.nextInt();
				System.out.println(sbiz.findByid(id));
//				System.out.println("是否确认删除y/n");
//				String s=sc.next();
				String s=use.getString("是否确认删除y/n");
				if("y".equals(s)){
					System.out.println(sbiz.delect(id));
					
					this.start();
				}else if("n".equals(s)){
					this.start();
				}else{
					System.out.println("输入错误!请重新选择：");
					this.delectShow();
				}
			}else if(select==0){
				System.out.println("系统退出");
				System.exit(1);
			}else{
				System.out.println("指令错误！请重新输入：");
				this.start();
			}
		}


	}



	private void addShow(){
		System.out.println("请输入学生信息：");
//		System.out.print("学号");
//		int id=sc.nextInt();
		int id=use.getInt("请输入学号");		
//		System.out.print("姓名：");
//		String name=sc.next();
		String name=use.getString("请输入姓名");
//		System.out.print("成绩：");
//		double score=sc.nextDouble();
		double score=use.getDouble("请输入成绩");
		Student stu=sbiz.findByid(id);
		if(stu==null){
			sbiz.add(id, name, score);
		}else{
			System.out.println("学号已存在，添加失败！");
		}		    
	}
	private void scoreShow(){
		view.showStudent();
	}
	private void arryShow(){
		view.arryShow();
		System.out.println("请选择：");
	}
	private void delectShow(){
		System.out.println("学生信息删除：");
		System.out.println("请输入要删除的学号");}

}
