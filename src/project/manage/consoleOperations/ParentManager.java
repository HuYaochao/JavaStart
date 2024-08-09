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
            console.displayMenu(new String[]{"添加家长", "删除家长", "更新家长", "查询家长", "返回上级菜单"});
            int choice = console.getIntInput("请选择操作: ");
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
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }

    private void addParent() {
        String name = console.getStringInput("请输入姓名: ");
        String gender = console.getStringInput("请输入性别: ");
        int age = console.getAgeInput();
        String relationship = console.getStringInput("请输入与学生关系: ");
        String contactNumber = console.getStringInput("请输入联系方式: ");
        Parent parent = new Parent(name, gender, age, relationship, contactNumber);
        parentManagement.addParent(parent);
        System.out.println("家长添加成功！");
    }

    private void removeParent() {
        String parentId = console.getStringInput("请输入要删除的家长姓名: ");
        parentManagement.removeParent(parentId);
        System.out.println("家长删除成功！");
    }

    private void updateParent() {
        String parentId = console.getStringInput("请输入要更新的家长姓名: ");
        Parent parent = parentManagement.getParent(parentId);
        if (parent != null) {
            String name = console.getStringInput("请输入新姓名: ");
            String gender = console.getStringInput("请输入新性别: ");
            int age = console.getAgeInput();
            String relationship = console.getStringInput("请输入新关系: ");
            String contactNumber = console.getStringInput("请输入新联系方式: ");
            parent.setName(name);
            parent.setGender(gender);
            parent.setAge(age);
            parent.setRelationship(relationship);
            parent.setContactNumber(contactNumber);
            parentManagement.updateParent(parent);
            System.out.println("家长信息更新成功！");
        } else {
            System.out.println("家长不存在！");
        }
    }

    private void queryParent() {
        String parentId = console.getStringInput("请输入家长姓名: ");
        Parent parent = parentManagement.getParent(parentId);
        if (parent != null) {
            System.out.println("家长信息：");
            System.out.println("姓名: " + parent.getName());
            System.out.println("性别: " + parent.getGender());
            System.out.println("年龄: " + parent.getAge());
            System.out.println("与学生关系: " + parent.getRelationship());
            System.out.println("联系方式: " + parent.getContactNumber());
        } else {
            System.out.println("家长不存在！");
        }
    }
}

