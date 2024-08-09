package project.manage.impl;

import project.manage.people.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */


public class StudentManagementImpl implements StudentManagement {
    private Map<String, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    @Override
    public void removeStudent(String studentId) {
        students.remove(studentId);
    }

    @Override
    public void updateStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    @Override
    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    @Override
    public List<Student> getStudentsByClass(String className) {
        return students.values().stream()
                .filter(student -> student.getClassName().equals(className))
                .collect(Collectors.toList());
    }
}

