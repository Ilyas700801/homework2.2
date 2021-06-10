package com.Geekteck;

public class Wolf extends Animal{
    private String name;
    private int age;

    public String getName() {
        return name;    }

    public int getAge() {
        return age;
    }

    public Wolf(int health, String name, String address, int age) {
        super(health, name, address);
        this.name = name;
        this.age = age;
    }

    public void methodName(String name){
        System.out.println(name);
    }

    public final void methodName(int age){
        System.out.println(age);
    }

}
