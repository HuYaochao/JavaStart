package com.hyc.encapsulation;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double getDistance(double m, double n) {
        return Math.sqrt(Math.pow(x - m, 2) + Math.pow(y - n, 2));
    }

    public double getDistance(Point pnt) {
        return Math.sqrt(Math.pow(x - pnt.getX(), 2) + Math.pow(y - pnt.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
