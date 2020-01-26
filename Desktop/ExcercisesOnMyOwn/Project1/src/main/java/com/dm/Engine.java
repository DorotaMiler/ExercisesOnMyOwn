package com.dm;

/*
 * Treść zadania znajdziesz w klasie Engine
 */

public class Engine {

    public Integer power;
    public Integer capacity;

    public Engine() {
        power = 100;
        capacity = 200;
    }

    // ToDo
    // 1. stwórz metodę getPower(), która zwróci wartość pola 'power'

    public Integer getPower() {
        return power;
    }

    // 2. stwórz metodę getCapacity(), która zwróci wartość pola 'capacity'

    public Integer getCapacity() {
        return capacity;
    }

    // 3. stwórz metodę printValues(), która wypisze wartość obydwu pól na terminal (System.out.println())
    public void printValues() {
        System.out.println("Power: " + getPower() + ", capacity: " + getCapacity());
    }
}