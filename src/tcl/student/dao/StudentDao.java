package tcl.student.dao;

import java.util.List;
import tcl.student.Student;

public interface StudentDao {
public boolean addStudent(Student stu);
public List<Student>showAllstudent();
public Student findStudentByid(int id);
public boolean removeStudent(int id);
}
