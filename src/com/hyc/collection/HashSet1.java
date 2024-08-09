package com.hyc.collection;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person(1,"hyc"));
        set.add(new Person(2,"yc"));
        set.add(new Person(3,"c"));
        System.out.println(set.size());


        for (Person person : set) {
            System.out.println(person.getAge()+" "+person.getName());
        }

        System.out.println(set.toString());
        System.out.println(set.hashCode());
        System.out.println(set.equals(set));

    }
}

class Person{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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
}