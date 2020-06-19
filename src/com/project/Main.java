package com.project;

public class Main {

    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer();
        carDealer.importCarsFromAbroad(10, 1000);

        System.out.println(carDealer.getCars());
    }
}
