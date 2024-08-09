package com.hyc.basic;

/**
 *
 * @author hyc
 * @date 2024/8/3
 * @version: 1.0
 */

public class Cylinder {
    private double radius;
    private double height;

    public boolean setValue(double radius,double height){
        if(radius<=0 && height<=0){
            return false;
        }
        else{
            this.radius=radius;
            this.height=height;
            return true;
        }
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    public  void info(){
        System.out.println("半径是："+this.radius+" 高度是："+this.height+" 低面积是："+getArea()+" 体积是："+getVolume());
    }
}
