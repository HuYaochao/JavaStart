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
            console.displayMenu(new String[]{"��ӳɼ�", "ɾ���ɼ�", "���³ɼ�", "��ѯ�ɼ�", "�����ϼ��˵�"});
            int choice = console.getIntInput("��ѡ�����: ");
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
                    System.out.println("��Чѡ�����������롣");
            }
        }
    }

    private void addGrade() {
        String studentId = console.getStringInput("������ѧ��ѧ��: ");
        String subject = console.getStringInput("�������Ŀ: ");
        int score = console.getScoreInput();
        Grade grade = new Grade(subject, score);
        gradeManagement.addGrade(studentId, grade);
        System.out.println("�ɼ���ӳɹ���");
    }

    private void removeGrade() {
        String studentId = console.getStringInput("������ѧ��ѧ��: ");
        String subject = console.getStringInput("�������Ŀ: ");
        gradeManagement.removeGrade(studentId, subject);
        System.out.println("�ɼ�ɾ���ɹ���");
    }

    private void updateGrade() {
        String studentId = console.getStringInput("������ѧ��ѧ��: ");
        String subject = console.getStringInput("�������Ŀ: ");
        Grade grade = gradeManagement.getGrade(studentId, subject);
        if (grade != null) {
            int score = console.getScoreInput();
            grade.setScore(score);
            gradeManagement.updateGrade(studentId, grade);
            System.out.println("�ɼ����³ɹ���");
        } else {
            System.out.println("�ɼ������ڣ�");
        }
    }

    private void queryGrade() {
        String studentId = console.getStringInput("������ѧ��ѧ��: ");
        String subject = console.getStringInput("�������Ŀ: ");
        Grade grade = gradeManagement.getGrade(studentId, subject);
        if (grade != null) {
            System.out.println("�ɼ���Ϣ��");
            System.out.println("��Ŀ: " + grade.getSubject());
            System.out.println("�ɼ�: " + grade.getScore());
        } else {
            System.out.println("�ɼ������ڣ�");
        }
    }
}
