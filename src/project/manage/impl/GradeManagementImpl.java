package project.manage.impl;

import project.manage.modules.Grade;
import project.manage.people.Student;

import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class GradeManagementImpl implements GradeManagement {
    private Map<String, Map<String, Grade>> studentGrades = new HashMap<>();
    private StudentManagement studentManagement;

    // 构造函数注入 StudentManagement 实例
    public GradeManagementImpl(StudentManagement studentManagement) {
        this.studentManagement = studentManagement;
    }

    @Override
    public void addGrade(String studentId, Grade grade) {
        studentGrades.computeIfAbsent(studentId, k -> new HashMap<>()).put(grade.getSubject(), grade);
    }

    @Override
    public void removeGrade(String studentId, String subject) {
        if (studentGrades.containsKey(studentId)) {
            studentGrades.get(studentId).remove(subject);
        }
    }

    @Override
    public void updateGrade(String studentId, Grade grade) {
        if (studentGrades.containsKey(studentId)) {
            studentGrades.get(studentId).put(grade.getSubject(), grade);
        }
    }

    @Override
    public Grade getGrade(String studentId, String subject) {
        return studentGrades.getOrDefault(studentId, Collections.emptyMap()).get(subject);
    }

    @Override
    public List<Grade> getGradesByClassAndSubject(String className, String subject) {
        List<Student> students = studentManagement.getStudentsByClass(className);
        List<Grade> grades = new ArrayList<>();
        for (Student student : students) {
            Grade grade = getGrade(student.getStudentId(), subject);
            if (grade != null) {
                grades.add(grade);
            }
        }
        return grades;
    }

    @Override
    public List<Student> getPassingStudents(String className, String subject) {
        List<Student> students = studentManagement.getStudentsByClass(className);
        return students.stream()
                .filter(student -> {
                    Grade grade = getGrade(student.getStudentId(), subject);
                    return grade != null && grade.getScore() >= 60;
                })
                .collect(Collectors.toList());
    }

    @Override
    public double getAverageGrade(String className, String subject) {
        List<Grade> grades = getGradesByClassAndSubject(className, subject);
        return grades.stream().mapToInt(Grade::getScore).average().orElse(0);
    }
}


