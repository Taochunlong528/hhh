package tcl.student.dao;

import java.util.List;

import tcl.student.impl.Student;

public interface StudentDao {
//增加学生的方法
public boolean addStudent(Student stu);
//查询学生的方法
public List<Student> showAllStudent();
//根据学号查询
public Student showStudentByid(int id);
//删除学生的方法
public boolean removeStudent(int id);
}
