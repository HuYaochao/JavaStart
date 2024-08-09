package com.hyc.collection;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class HashMap1 {
    public static void main(String[] args){
        HashMap<Person1,Integer> map = new HashMap<>();
        map.put(new Person1("张三",18),18);
        map.put(new Person1("李四",19),19);
        map.put(new Person1("王五",20),20);
        System.out.println(map);
    }
}

class Person1{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person1 person1 = (Person1) o;
        return age == person1.age && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
