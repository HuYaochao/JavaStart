package com.hyc.basic;

public class Couple {
    public static void main(String[] args) {
        Husband husband = new Husband();
        Wife wife = new Wife();
        husband.name="zs";
        husband.age=30;
        wife.name="ls";
        wife.age=28;
        husband.wife=wife;
        wife.husband=husband;
        husband.showInfo();
        wife.showInfo();
    }
}
