package com.hyc.polymorphic.triangle;
/**
 *
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        Triangle t = new Triangle(1,2,3);
        System.out.println(t.getPerimeter());
        Circle c = new Circle(2);
        System.out.println(c.getPerimeter());
    }
}
