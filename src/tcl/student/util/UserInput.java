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
				System.out.println("格式不正确！请重新输入");
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
				System.out.println("你输入的格式不正确，请重新输入！");
			}
		}		
	}
}
