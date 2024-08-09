package com.hyc.encapsulation;

import java.util.Scanner;

/**
 * @author hyc
 * @date 2024/8/5
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {

        // 存储学生信息
        Student[] students = new Student[10];

        // 循环判断用户输入
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 操作台
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");

            StudentAdd studentAdd = new StudentAdd();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentAdd.addStudents(students);
                    break;
                case 2:
                    System.out.println("删除学生");
                    // 删除学生逻辑
                    System.out.println("请输入要删除的学生的学号");
                    int id = scanner.nextInt();
                    for (int i = 0; true; i++) {
                        if(students[i] == null){
                            System.out.println("该学生不存在");
                        } else if (students[i].getId() == id) {
                            students[i] = null;
                            System.out.println("删除学生成功");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("修改学生");
                    // 修改学生逻辑
                    System.out.println("请输入要修改的学生的学号");
                    int id1 = scanner.nextInt();
                    for (int i = 0; true; i++) {
                        if(students[i] == null) {
                            System.out.println("该学生不存在");
                        }else if (students[i].getId() == id1) {
                            System.out.println("请输入修改后的学生姓名");
                            String name = scanner.next();
                            students[i].setName(name);
                            System.out.println("请输入修改后的学生性别");
                            String gender = scanner.next();
                            students[i].setGender(gender);
                            System.out.println("请输入修改后的学生班级");
                            String grade = scanner.next();
                            students[i].setGrade(grade);
                            System.out.println("请输入修改后的学生年龄");
                            int age = scanner.nextInt();
                            students[i].setAge(age);
                            System.out.println("修改学生成功");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("查询学生");
                    for (Student student : students) {
                        if (student != null) {
                            System.out.println(student);
                        }
                    }
                    System.out.println("请输入要查询的学生的学号");
                    int id2 = scanner.nextInt();
                    for (int i = 0; true; i++) {
                        if(students[i] == null) {
                            System.out.println("该学生不存在");
                            break;
                        }else if (students[i].getId() == id2) {
                            System.out.println(students[i].toString());
                            System.out.println("查询学生成功");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("退出系统");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
            if (choice == 5) {
                break;
            }
        }
        scanner.close();
    }
}

