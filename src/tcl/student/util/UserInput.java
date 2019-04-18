package tcl.student.util;

import java.util.Scanner;

public class UserInput {
	public String getString(String msg){
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		return sc.next();		
	}
	public int getInt(String msg){
		while(true){
			try {
				System.out.println(msg);
				Scanner sc=new Scanner(System.in);
				return sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("��ʽ����ȷ������������");
			}
		}
	}
	public double getDouble(String msg){
		while(true){
			try {
				System.out.println(msg);
				Scanner sc=new Scanner(System.in);
				return sc.nextDouble();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("������ĸ�ʽ����ȷ�����������룡");
			}
		}		
	}
}
