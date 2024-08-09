package com.hyc.encapsulation;

import java.util.Scanner;

public class StudentAdd {
    public void addStudents(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        String choice1 = "y";
        int index = 0;
        do {
            System.out.println("请输入添加学生的姓名");
            String name = scanner.next();

            System.out.println("请输入添加学生的性别");
            String gender = scanner.next();

            System.out.println("请输入添加学生的班级");
            String grade = scanner.next();

            System.out.println("请输入添加学生的学号");
            int id = scanner.nextInt();
            System.out.println("请输入添加学生的年龄");
            int age = scanner.nextInt();
            // 判断输入是否合法
            if (name == null || name.isEmpty()) {
                System.out.println("姓名不能为空");
            } else if (id <= 0) {
                System.out.println("学号不能为空");
            } else if (age <= 0) {
                System.out.println("年龄不能为空");
            } else if (gender == null || gender.isEmpty()) {
                System.out.println("性别不能为空");
            } else if (grade == null || grade.isEmpty()) {
                System.out.println("班级不能为空");
            } else {
                Student student = new Student(name, id, age, gender, grade);
                System.out.println("添加学生成功");
                if (index < students.length) {
                    students[index] = student;
                    index++;
                } else {
                    System.out.println("学生数组已满，无法添加更多学生");
                }
                System.out.println("是否继续添加学生？(y/n)");
                choice1 = scanner.next();
            }
        } while ("y".equals(choice1));
    }


}
