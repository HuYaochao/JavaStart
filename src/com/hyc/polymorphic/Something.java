package com.hyc.polymorphic;
class Something {
    public static void main(String[] args) {
        Something s = new Something();
        s.doSomething();
    }
    int i;
    public void doSomething() {
        System.out.println("i = " + i);
    }
}

