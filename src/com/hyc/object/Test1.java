package com.hyc.object;

interface A {
    public boolean show();
}

/**
 * @author hyc
 * @date 2024/8/7
 * @version: 1.0
 */

public class Test1 {

    public static void main(String[] args) {
        A a = new BImpl();
        a.show();

        A a1 = new A() {
            @Override
            public boolean show() {
                System.out.println("A");

                return false;
            }
        };
        System.out.println(a1.show());
        
        A a2 = () -> {
           System.out.println("C");
           return false;};
        System.out.println(a2.show());
    }
}

class BImpl implements A {
    @Override
    public boolean show() {
        System.out.println("B");
        return false;
    }
}
