package com.hyc.basic;

public class Husband {
    String name;
    int age;
    Wife wife;

    public void showInfo(){
        System.out.println("com.hyc.basic.Husband Name: " + name);
        System.out.println("com.hyc.basic.Husband Age: " + age);
        System.out.println("com.hyc.basic.Wife Name: " + wife.name);
        System.out.println("com.hyc.basic.Wife Age: " + wife.age);
    }

}
