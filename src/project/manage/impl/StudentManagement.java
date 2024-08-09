package project.manage.impl;

import project.manage.people.Student;

import java.util.List; /**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public interface StudentManagement {
    void addStudent(Student student);
    void removeStudent(String studentId);
    void updateStudent(Student student);
    Student getStudent(String studentId);
    List<Student> getStudentsByClass(String className);
}
