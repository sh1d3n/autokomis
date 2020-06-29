package com.project;

public class Main {

    public static void main(String[] args) {
        TownHall townHall = new TownHall();

        CarDealer carDealer = new CarDealer(townHall);
        carDealer.importCarsFromAbroad(10, 1000);

        townHall.listAllRegisteredCars();

        Human andrzej = new Human("Andrzeju", "Jak Ci na imie", 20000);

        CarDetails mostExpensiveCar = carDealer.showMostExpensiveCar();

        carDealer.sellCarToBuyer(mostExpensiveCar, andrzej);
        System.out.println("Andrzej spent a fortune for a car");

        Human jacek = new Human("Jacek", "Jacek", 20000);

        CarDetails cheapestCar = carDealer.showCheapestCar();

        carDealer.sellCarToBuyer(cheapestCar, jacek);
        System.out.println("Jacek has just bought a car");

        carDealer.buyCarFromSeller(andrzej);
        System.out.println("Andrzej sold his car");

        Human wiesiu = new Human("Wieslaw", "Wieslaw", 2000000);

        CarDetails randomCar = carDealer.showRandomCar();

        carDealer.sellCarToBuyer(randomCar, wiesiu);
        System.out.println("Millionaire bought another car!");

        townHall.listAllRegisteredCars();
        carDealer.listDealerTransactions();
    }
}
