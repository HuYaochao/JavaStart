package com.hyc.extend;
/**
 *
 * @author hyc
 * @date 2024/8/6
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("111","m","zs","bj");
        Person p2 = new Person("222","m","ls","sh");
        Person p3 = new Person("222","m","ls","sh");
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p3.equals(p2));

        Student s1 = new Student("111","m","zs","bj");
        Student s2 = new Student("222","m","ls","sh");
        Student s3 = new Student("222","m","ls","sh");
        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));

        Employee[] empls = new Employee[2];
        empls[0] = new Employee("zs",1213,3000);
        empls[1] = new Manager("ls",1111,3000);
        for (Employee e : empls) {
            System.out.println(e);
            System.out.println(e.getBonus());
        }
    }

}
