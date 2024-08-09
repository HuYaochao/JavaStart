package project.manage.consoleOperations;

import project.manage.impl.StudentManagementImpl;
import project.manage.people.Student;
/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

public class StudentManager {
    private StudentManagementImpl studentManagement = new StudentManagementImpl();
    private ConsoleOperations console = new ConsoleOperations();

    public void manageStudentInfo() {
        boolean back = false;
        while (!back) {
            console.displayMenu(new String[]{"添加学生", "删除学生", "更新学生", "查询学生", "返回上级菜单"});
            int choice = console.getIntInput("请选择操作: ");
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    queryStudent();
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }

    private void addStudent() {
        String name = console.getStringInput("请输入姓名: ");
        String gender = console.getGenderInput();
        int age = console.getAgeInput();
        String studentId = console.getStringInput("请输入学号: ");
        String className = console.getStringInput("请输入班级: ");
        Student student = new Student(name, gender, age, studentId, className);
        studentManagement.addStudent(student);
        System.out.println("学生添加成功！");
    }

    private void removeStudent() {
        String studentId = console.getStringInput("请输入要删除的学生学号: ");
        studentManagement.removeStudent(studentId);
        System.out.println("学生删除成功！");
    }

    private void updateStudent() {
        String studentId = console.getStringInput("请输入要更新的学生学号: ");
        Student student = studentManagement.getStudent(studentId);
        if (student != null) {
            String name = console.getStringInput("请输入新姓名: ");
            String gender = console.getStringInput("请输入新性别: ");
            int age = console.getAgeInput();
            String className = console.getStringInput("请输入新班级: ");
            student.setName(name);
            student.setGender(gender);
            student.setAge(age);
            student.setClassName(className);
            studentManagement.updateStudent(student);
            System.out.println("学生信息更新成功！");
        } else {
            System.out.println("学生不存在！");
        }
    }

    private void queryStudent() {
        String studentId = console.getStringInput("请输入学生学号: ");
        Student student = studentManagement.getStudent(studentId);
        if (student != null) {
            System.out.println("学生信息：");
            System.out.println("姓名: " + student.getName());
            System.out.println("性别: " + student.getGender());
            System.out.println("年龄: " + student.getAge());
            System.out.println("学号: " + student.getStudentId());
            System.out.println("班级: " + student.getClassName());
        } else {
            System.out.println("学生不存在！");
        }
    }
}

