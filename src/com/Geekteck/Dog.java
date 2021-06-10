package com.Geekteck;

public final class Dog extends Wolf {

    private Home home;

    public Dog(int health, String name, String address, int age, Home home) {
        super(health, name, address, age);
        this.home = home;
    }

    public Home getHome() {
        return home;
    }

    @Override
    public void methodName(String name) {
        super.methodName(name);
    }
}
    