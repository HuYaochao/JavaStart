package com.hyc.encapsulation;

public class Box {
    private int width;
    private int height;
    private int length;
    public int getVolume() {
        return width * height * length;
    }

    public Box() {
        this.width = 0;
        this.height = 0;
        this.length = 0;
    }
    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
}
