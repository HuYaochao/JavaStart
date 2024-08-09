package com.hyc.polymorphic.triangle;
/**
 *
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

public class Circle extends Shape{
    double radius;

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
}
