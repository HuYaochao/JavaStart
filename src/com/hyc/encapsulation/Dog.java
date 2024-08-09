package com.hyc.encapsulation;

public class Dog {
    private String name;
    private String color;
    private int age;
    public Dog() {
        this.name = "xiaohei";
        this.color = "black";
        this.age = 5;
    }
    public void showInfo(){
        System.out.println("name:"+name+"color:"+color+"age:"+age);
    }
}
