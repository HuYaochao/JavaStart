package com.hyc.extend;

/**
 *
 * @author hyc
 * @date 2024/8/6
 * @version: 1.0
 */

public class Student extends Person{

    Student(){

    }
    Student(String id,String gender,String name,String address){
        super(id,gender,name,address);
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"student";
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

}
