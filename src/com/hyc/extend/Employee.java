package com.hyc.extend;

public class Employee {
    private String name;
    private int id;
    private double bonus;


    public Employee() {

    }
    public Employee(String name, int id, double bonus) {
        this.name = name;
        this.id = id;
        this.bonus= bonus;
    }

    public double getBonus() {
        return bonus*1.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
