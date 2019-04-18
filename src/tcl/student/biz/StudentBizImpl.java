package tcl.student.biz;

import java.util.Collections;
import java.util.List;

import tcl.student.Student;
import tcl.student.dao.StudentDao;
import tcl.student.dao.impl.StudentDaoImol;
import tcl.student.util.Rule;

public class StudentBizImpl implements StudentBiz {
private StudentDao sdao;
	public StudentBizImpl() {
	this.sdao=new StudentDaoImol();
	
}

	@Override
	public String add(int id,String name,double score) {
		return sdao.addStudent(new Student(id, name, score))?"添加成功":"添加失败";

	}

	@Override
	public List<Student> shoAll() {		
		return sdao.showAllstudent();
	}

	@Override
	public List<Student> showArray(boolean b) {
		// TODO Auto-generated method stub
		List<Student>list=sdao.showAllstudent();
		Collections.sort(list, new Rule(b));
		return list;
	}

	@Override
	public String delect(int id) {
		// TODO Auto-generated method stub
		return sdao.removeStudent(id)?"删除成功":"删除失败";
	}

}
