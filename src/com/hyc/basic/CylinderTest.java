package com.hyc.basic;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setValue(2, 2);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
        cylinder.info();
    }
}
