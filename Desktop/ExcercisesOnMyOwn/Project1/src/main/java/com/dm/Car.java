package com.dm;

public class Car {

    public String name;
    public int maxSpeed;
    public Engine engine;

    public Car() {
        name = "default";
        maxSpeed = 100;
        engine = new Engine();
    }

    public Car(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}