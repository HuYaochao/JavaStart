package com.hyc.extend;
/**
 *
 * @author hyc
 * @date 2024/8/6
 * @version: 1.0
 */

public class Manager extends Employee {
    Manager(String name, int id, double bonus){
       super(name,id,bonus); 
    }
    Manager(){
        
    }
    @Override
    public double getBonus(){
        return super.getBonus()*2;
    }
    
}
