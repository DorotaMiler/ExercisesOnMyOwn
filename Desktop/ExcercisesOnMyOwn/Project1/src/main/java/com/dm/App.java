package com.dm;

/*
 * Treść zadania znajdziesz w metodzie main
 * Rozpocznij od wykonania zadania w klasie Engine!
 */

public class App {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.name);
        System.out.println(car.engine.power);

        // 1. stwórz nowy obiekt typu Engine
        Engine engine = new Engine();

        // 2. stwórz nowe pole, którego wartość będzie wynikiem metody getPower() np. Integer value = engine.getPower()
        Integer powerValue = engine.getPower();

        // 3. stwórz kolejne pole, tym razem niech przyjmie wartość z metody getCapacity()
        Integer capacityValue = engine.getCapacity();

        // 4. uruchom metodę printValues() dla wcześniej stworzonego obiektu typu Engine
        engine.printValues();
    }
}
