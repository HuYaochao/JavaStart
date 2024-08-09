package com.hyc.exception;
/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) throws Exception{
        try{
            Person p = new Person();
            p.setAge(-10);
            System.out.println(p);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            
        }
    }
}
class Person{
    private int age;
    public void setAge(int age) throws Exception{
        if(age<0){
            Exception exception=new Exception("年龄非法");
            throw exception;
        }
        this.age=age;
    }
}
