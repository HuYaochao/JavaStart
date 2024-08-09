package com.hyc.polymorphic;

/**
 *
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

