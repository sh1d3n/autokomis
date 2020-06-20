package com.project;

public class Main {

    public static void main(String[] args) {
        TownHall townHall = new TownHall();

        CarDealer carDealer = new CarDealer(townHall);
        carDealer.importCarsFromAbroad(10, 1000);

        townHall.listAllRegisteredCars();
    }
}
