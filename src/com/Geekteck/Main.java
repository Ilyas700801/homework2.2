package com.Geekteck;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Wolf objectA = new Wolf(99, "Akella", "forest", 5);
        System.out.println(objectA.getHealth() + "\n" + objectA.getName() + "\n" + objectA.getAddress() + "\n"
                + objectA.getAge());

        Home home=new Home(Color.BLACK);
        Dog objectB = new Dog(50, "Tuzik", "booth", 10, home);
        System.out.println(objectB.getHealth() + "\n" + objectB.getName() + "\n" + objectB.getAddress()
                + "\n" + objectB.getAge() + "\n" + objectB.getHome());

        Dog objectC = new Dog(60, "Buldog", "booth", 5, home);
        System.out.println(objectC.getHealth() + "\n" + objectC.getName() + "\n" + objectC.getAddress()
                + "\n" + objectC.getAge() +"\n"+ objectC.getHome());

        objectB.methodName("Hello World!");
        objectC.methodName(213);


    }
}
