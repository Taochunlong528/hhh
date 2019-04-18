package tcl.student.biz;

import java.util.List;

import tcl.student.impl.Student;

public interface StudentBiz {
public String add(int id,String name,double score);
public List<Student> showAll();
public List<Student> showArray(boolean b);
public Student findByid(int id);
public String delect(int id);

}
