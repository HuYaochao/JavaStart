package project.manage.consoleOperations;
/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

import project.manage.impl.GradeManagementImpl;
import project.manage.modules.Grade;

public class GradeManager {
    private GradeManagementImpl gradeManagement;
    private ConsoleOperations console = new ConsoleOperations();

    public GradeManager(GradeManagementImpl gradeManagement) {
        this.gradeManagement = gradeManagement;
    }

    public void manageGrades() {
        boolean back = false;
        while (!back) {
            console.displayMenu(new String[]{"添加成绩", "删除成绩", "更新成绩", "查询成绩", "返回上级菜单"});
            int choice = console.getIntInput("请选择操作: ");
            switch (choice) {
                case 1:
                    addGrade();
                    break;
                case 2:
                    removeGrade();
                    break;
                case 3:
                    updateGrade();
                    break;
                case 4:
                    queryGrade();
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }

    private void addGrade() {
        String studentId = console.getStringInput("请输入学生学号: ");
        String subject = console.getStringInput("请输入科目: ");
        int score = console.getScoreInput();
        Grade grade = new Grade(subject, score);
        gradeManagement.addGrade(studentId, grade);
        System.out.println("成绩添加成功！");
    }

    private void removeGrade() {
        String studentId = console.getStringInput("请输入学生学号: ");
        String subject = console.getStringInput("请输入科目: ");
        gradeManagement.removeGrade(studentId, subject);
        System.out.println("成绩删除成功！");
    }

    private void updateGrade() {
        String studentId = console.getStringInput("请输入学生学号: ");
        String subject = console.getStringInput("请输入科目: ");
        Grade grade = gradeManagement.getGrade(studentId, subject);
        if (grade != null) {
            int score = console.getScoreInput();
            grade.setScore(score);
            gradeManagement.updateGrade(studentId, grade);
            System.out.println("成绩更新成功！");
        } else {
            System.out.println("成绩不存在！");
        }
    }

    private void queryGrade() {
        String studentId = console.getStringInput("请输入学生学号: ");
        String subject = console.getStringInput("请输入科目: ");
        Grade grade = gradeManagement.getGrade(studentId, subject);
        if (grade != null) {
            System.out.println("成绩信息：");
            System.out.println("科目: " + grade.getSubject());
            System.out.println("成绩: " + grade.getScore());
        } else {
            System.out.println("成绩不存在！");
        }
    }
}
