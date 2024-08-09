package com.hyc.polymorphic;
/**
 *
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

abstract public class Animal {
    abstract void shout();
}

class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("喵喵喵");
    }
}
class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("汪汪汪");
    }
}
class Test1{
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.shout();
        animal = new Dog();
        animal.shout();
    }
}