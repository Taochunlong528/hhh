package tcl.student.dao;

import java.util.List;

import tcl.student.impl.Student;

public interface StudentDao {
//����ѧ���ķ���
public boolean addStudent(Student stu);
//��ѯѧ���ķ���
public List<Student> showAllStudent();
//����ѧ�Ų�ѯ
public Student showStudentByid(int id);
//ɾ��ѧ���ķ���
public boolean removeStudent(int id);
}
