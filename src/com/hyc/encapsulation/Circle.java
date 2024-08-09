package com.hyc.encapsulation;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }

    public Circle compare(Circle circle) {
        if (this.radius > circle.radius) {
            return this;
        } else {
            return circle;
        }
    }

}
