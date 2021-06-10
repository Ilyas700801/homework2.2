package com.Geekteck;

public class Animal {
    private int health;
    private String name;
    private String address;

    public Animal(int health, String name, String address) {
        this.health = health;
        this.name = name;
        this.address = address;
    }


    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
