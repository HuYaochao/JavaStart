package project.manage.impl;

/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

import project.manage.modules.Grade;
import project.manage.people.Student;

import java.util.List;

public interface GradeManagement {
    void addGrade(String studentId, Grade grade);
    void removeGrade(String studentId, String subject);
    void updateGrade(String studentId, Grade grade);
    Grade getGrade(String studentId, String subject);
    List<Grade> getGradesByClassAndSubject(String className, String subject);
    List<Student> getPassingStudents(String className, String subject);
    double getAverageGrade(String className, String subject);
}
