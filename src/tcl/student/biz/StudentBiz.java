package tcl.student.biz;

import java.util.List;

import tcl.student.Student;

public interface StudentBiz {
public String add(int id,String name,double score);
public List<Student>shoAll();
public List<Student>showArray(boolean b);
public String delect(int id);
}
