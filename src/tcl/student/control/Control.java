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
		view.print("��ѡ��");
		int select=sc.nextInt();
		while(true){
			if(select==1){
				System.out.println(">>>ѧ����Ϣ¼��:");
				this.addShow();
//				System.out.println("�Ƿ����y/n");
//				String s=sc.next();
				String s=use.getString("�Ƿ����y/n");
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
					System.out.println("�����������������");
					this.arryShow();
				}
				this.start();
			}else if(select==4){
				this.delectShow();
				int id=sc.nextInt();
				System.out.println(sbiz.findByid(id));
//				System.out.println("�Ƿ�ȷ��ɾ��y/n");
//				String s=sc.next();
				String s=use.getString("�Ƿ�ȷ��ɾ��y/n");
				if("y".equals(s)){
					System.out.println(sbiz.delect(id));
					
					this.start();
				}else if("n".equals(s)){
					this.start();
				}else{
					System.out.println("�������!������ѡ��");
					this.delectShow();
				}
			}else if(select==0){
				System.out.println("ϵͳ�˳�");
				System.exit(1);
			}else{
				System.out.println("ָ��������������룺");
				this.start();
			}
		}


	}



	private void addShow(){
		System.out.println("������ѧ����Ϣ��");
//		System.out.print("ѧ��");
//		int id=sc.nextInt();
		int id=use.getInt("������ѧ��");		
//		System.out.print("������");
//		String name=sc.next();
		String name=use.getString("����������");
//		System.out.print("�ɼ���");
//		double score=sc.nextDouble();
		double score=use.getDouble("������ɼ�");
		Student stu=sbiz.findByid(id);
		if(stu==null){
			sbiz.add(id, name, score);
		}else{
			System.out.println("ѧ���Ѵ��ڣ����ʧ�ܣ�");
		}		    
	}
	private void scoreShow(){
		view.showStudent();
	}
	private void arryShow(){
		view.arryShow();
		System.out.println("��ѡ��");
	}
	private void delectShow(){
		System.out.println("ѧ����Ϣɾ����");
		System.out.println("������Ҫɾ����ѧ��");}

}
