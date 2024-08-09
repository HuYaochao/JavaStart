package com.hyc.polymorphic.triangle;
/**
 *
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

public class Triangle extends Shape{
    double a;
    double b;
    double c;
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }
    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
