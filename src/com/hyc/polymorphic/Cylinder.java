package com.hyc.polymorphic;
/**
 *
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

public class Cylinder extends Circle{
        private double height;

        public Cylinder(double radius, double height) {
                super(radius);
                this.height = height;
        }

        public Cylinder() {}

        @Override
        public double getArea() {
                return 2 * super.getArea() + 2 * Math.PI * super.getRadius() * height;

        }
        public double getVolume() {
                return super.getArea() * height;
        }
}


