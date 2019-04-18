package tcl.student.util;

import java.util.Comparator;

import tcl.student.impl.Student;

public class Rule implements Comparator<Student> {
	private boolean flag=true;
	public Rule(boolean flag) {
		super();
		this.flag = flag;
	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(flag==true){
			if(o1.getScore()>o2.getScore()){
				return 1;
			}else if(o1.getScore()<o2.getScore()){
				return-1;
			}
		}else{
			if(o1.getScore()>o2.getScore()){
				return -1;
			}else if(o1.getScore()<o2.getScore()){
				return 1;
			}
		}
		return 0;
	}

}
