package project.manage.consoleOperations;

/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

import project.manage.impl.ParentManagementImpl;
import project.manage.people.Parent;

public class ParentManager {
    private ParentManagementImpl parentManagement = new ParentManagementImpl();
    private ConsoleOperations console = new ConsoleOperations();

    public void manageParentInfo() {
        boolean back = false;
        while (!back) {
            console.displayMenu(new String[]{"��Ӽҳ�", "ɾ���ҳ�", "���¼ҳ�", "��ѯ�ҳ�", "�����ϼ��˵�"});
            int choice = console.getIntInput("��ѡ�����: ");
            switch (choice) {
                case 1:
                    addParent();
                    break;
                case 2:
                    removeParent();
                    break;
                case 3:
                    updateParent();
                    break;
                case 4:
                    queryParent();
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("��Чѡ�����������롣");
            }
        }
    }

    private void addParent() {
        String name = console.getStringInput("����������: ");
        String gender = console.getStringInput("�������Ա�: ");
        int age = console.getAgeInput();
        String relationship = console.getStringInput("��������ѧ����ϵ: ");
        String contactNumber = console.getStringInput("��������ϵ��ʽ: ");
        Parent parent = new Parent(name, gender, age, relationship, contactNumber);
        parentManagement.addParent(parent);
        System.out.println("�ҳ���ӳɹ���");
    }

    private void removeParent() {
        String parentId = console.getStringInput("������Ҫɾ���ļҳ�����: ");
        parentManagement.removeParent(parentId);
        System.out.println("�ҳ�ɾ���ɹ���");
    }

    private void updateParent() {
        String parentId = console.getStringInput("������Ҫ���µļҳ�����: ");
        Parent parent = parentManagement.getParent(parentId);
        if (parent != null) {
            String name = console.getStringInput("������������: ");
            String gender = console.getStringInput("���������Ա�: ");
            int age = console.getAgeInput();
            String relationship = console.getStringInput("�������¹�ϵ: ");
            String contactNumber = console.getStringInput("����������ϵ��ʽ: ");
            parent.setName(name);
            parent.setGender(gender);
            parent.setAge(age);
            parent.setRelationship(relationship);
            parent.setContactNumber(contactNumber);
            parentManagement.updateParent(parent);
            System.out.println("�ҳ���Ϣ���³ɹ���");
        } else {
            System.out.println("�ҳ������ڣ�");
        }
    }

    private void queryParent() {
        String parentId = console.getStringInput("������ҳ�����: ");
        Parent parent = parentManagement.getParent(parentId);
        if (parent != null) {
            System.out.println("�ҳ���Ϣ��");
            System.out.println("����: " + parent.getName());
            System.out.println("�Ա�: " + parent.getGender());
            System.out.println("����: " + parent.getAge());
            System.out.println("��ѧ����ϵ: " + parent.getRelationship());
            System.out.println("��ϵ��ʽ: " + parent.getContactNumber());
        } else {
            System.out.println("�ҳ������ڣ�");
        }
    }
}

