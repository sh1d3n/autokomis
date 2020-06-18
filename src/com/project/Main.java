package com.project;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Michał", "Jakusz");

        Car car = new Car("fiat","audi");
        human.setCar(car);
    }
}
