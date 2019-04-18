package tcl.student.biz.impl;
import java.util.Collections;
import java.util.List;
import tcl.student.biz.StudentBiz;
import tcl.student.dao.StudentDao;
import tcl.student.dao.impl.StudentDaoImpl;
import tcl.student.impl.Student;
import tcl.student.util.Rule;
public class StudentBizImpl implements StudentBiz {
private StudentDao sdao;
	public StudentBizImpl() {	
	this.sdao = new StudentDaoImpl();
}
	@Override
	public String add(int id, String name, double score) {
		boolean b=sdao.addStudent(new Student(id, name, score));
		return b?"Ìí¼Ó³É¹¦£¡":"Ìí¼ÓÊ§°Ü£¡";
	}
	@Override
	public List<Student> showAll() {
		// TODO Auto-generated method stub		
		return sdao.showAllStudent();
	}

	@Override
	public List<Student> showArray(boolean b) {
		// TODO Auto-generated method stub
		List<Student>list=sdao.showAllStudent();
		Collections.sort(list,new Rule(b));
		return list;
	}
	@Override
	public Student findByid(int id) {
		// TODO Auto-generated method stub
		return sdao.showStudentByid(id);
	}
	@Override
	public String delect(int id) {
		// TODO Auto-generated method stub
		return sdao.removeStudent(id)?"É¾³ý³É¹¦£¡":"É¾³ýÊ§°Ü£¡";
	}

}
