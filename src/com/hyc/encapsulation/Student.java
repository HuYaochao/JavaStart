package com.hyc.encapsulation;

public class Student {
    private String name;
    private int id;
    private int age;
    private String gender;
    private String grade;

    @Override
    public String toString() {
        return "com.hyc.encapsulation.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Student(String name, int id, int age, String gender, String grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
