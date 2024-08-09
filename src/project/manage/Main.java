package project.manage;

import project.manage.consoleOperations.ConsoleOperations;
import project.manage.consoleOperations.GradeManager;
import project.manage.consoleOperations.ParentManager;
import project.manage.consoleOperations.StudentManager;
import project.manage.impl.GradeManagementImpl;
import project.manage.impl.StudentManagementImpl;
/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        ConsoleOperations console = new ConsoleOperations();
        StudentManager studentManager = new StudentManager();
        GradeManager gradeManager = new GradeManager(new GradeManagementImpl(new StudentManagementImpl()));
        ParentManager parentManager = new ParentManager();

        boolean exit = false;
        while (!exit) {
            console.displayMenu(new String[]{"学生信息管理", "成绩管理", "家长信息管理", "退出系统"});
            int choice = console.getIntInput("请选择操作: ");
            switch (choice) {
                case 1:
                    studentManager.manageStudentInfo();
                    break;
                case 2:
                    gradeManager.manageGrades();
                    break;
                case 3:
                    parentManager.manageParentInfo();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }
}
