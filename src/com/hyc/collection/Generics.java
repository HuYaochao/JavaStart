package com.hyc.collection;

import java.util.List;

/**
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class Generics {
    public static void main(String[] args) {
//    List<Animal> co1 = new ArrayList<>();
//    List<Dog> list= new ArrayList<>();
//    countLegs1(co1);
//    countLegs1(list);
//    countLegs2(list);
//    countLegs3(list);
//
//    countLegs4(list);
//    countLegs4(co1);

    }

    static void countLegs1(List<?> animals) {

    }

    static void countLegs2(List<? extends Animal> animals) {
        int num = 0;
        for (Animal animal : animals) {
            num += animal.age;
        }
    }

    static void countLegs3(List<Animal> animals) {
        int num = 0;
        for (Animal animal : animals) {
            num += animal.age;
        }
    }

    static void countLegs4(List<? super Animal> animals) {
    }
}

class Animal {
    int age;
}

class Dog extends Animal {
}


//main
//        Container<String> c = new Container<>();
//        c.add("hello");
//        String str = c.get();
//        System.out.println(str);
//
//                A<String> a = new A<>();
//        a.show("hello");
//        String s = a.get("hello");
//        System.out.println(s);


//class Container<T> {
//    private ArrayList<T> a1 = new ArrayList<>();
//
//    public void add(T t) {
//        a1.add(t);
//    }
//
//    public T get() {
//        return a1.getFirst();
//    }
//}
//
//class A<M>{
//    public void show(M m){
//        System.out.println(m);
//    }
//
//    public M get(M m){
//        return m;
//    }
//}

