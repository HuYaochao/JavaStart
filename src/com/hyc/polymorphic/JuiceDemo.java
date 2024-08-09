package com.hyc.polymorphic;
/**
 *
 * @author hyc
 * @date 2024/8/6
 * @version: 1.0
 */


public class JuiceDemo {
    public static void main(String[] args) {
        JuiceMachine juiceMachine = new JuiceMachine();
        juiceMachine.makeJuice(new Apple());
        juiceMachine.makeJuice(new Orange());
    }
}

class JuiceMachine{
    public void makeJuice(Fruit fruit){
        fruit.juice();
    }
}

abstract class Fruit {
    public void juice() {
        System.out.println("Fruit juice");
    }
}
class Apple extends Fruit {
    @Override
    public void juice() {
        System.out.println("Apple juice");
    }
}
class Orange extends Fruit {
    @Override
    public void juice() {
        System.out.println("Orange juice");
    }
}
