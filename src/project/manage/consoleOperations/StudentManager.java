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
            console.displayMenu(new String[]{"���ѧ��", "ɾ��ѧ��", "����ѧ��", "��ѯѧ��", "�����ϼ��˵�"});
            int choice = console.getIntInput("��ѡ�����: ");
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
                    System.out.println("��Чѡ�����������롣");
            }
        }
    }

    private void addStudent() {
        String name = console.getStringInput("����������: ");
        String gender = console.getGenderInput();
        int age = console.getAgeInput();
        String studentId = console.getStringInput("������ѧ��: ");
        String className = console.getStringInput("������༶: ");
        Student student = new Student(name, gender, age, studentId, className);
        studentManagement.addStudent(student);
        System.out.println("ѧ����ӳɹ���");
    }

    private void removeStudent() {
        String studentId = console.getStringInput("������Ҫɾ����ѧ��ѧ��: ");
        studentManagement.removeStudent(studentId);
        System.out.println("ѧ��ɾ���ɹ���");
    }

    private void updateStudent() {
        String studentId = console.getStringInput("������Ҫ���µ�ѧ��ѧ��: ");
        Student student = studentManagement.getStudent(studentId);
        if (student != null) {
            String name = console.getStringInput("������������: ");
            String gender = console.getStringInput("���������Ա�: ");
            int age = console.getAgeInput();
            String className = console.getStringInput("�������°༶: ");
            student.setName(name);
            student.setGender(gender);
            student.setAge(age);
            student.setClassName(className);
            studentManagement.updateStudent(student);
            System.out.println("ѧ����Ϣ���³ɹ���");
        } else {
            System.out.println("ѧ�������ڣ�");
        }
    }

    private void queryStudent() {
        String studentId = console.getStringInput("������ѧ��ѧ��: ");
        Student student = studentManagement.getStudent(studentId);
        if (student != null) {
            System.out.println("ѧ����Ϣ��");
            System.out.println("����: " + student.getName());
            System.out.println("�Ա�: " + student.getGender());
            System.out.println("����: " + student.getAge());
            System.out.println("ѧ��: " + student.getStudentId());
            System.out.println("�༶: " + student.getClassName());
        } else {
            System.out.println("ѧ�������ڣ�");
        }
    }
}

