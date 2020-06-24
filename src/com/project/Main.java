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

        Human jacek = new Human("Jacek", "Jacek", 20000);

        CarDetails cheapestCar = carDealer.showCheapestCar();

        carDealer.sellCarToBuyer(cheapestCar, jacek);

        carDealer.buyCarFromSeller(andrzej);

        Human wiesiu = new Human("Wieslaw", "Wieslaw", 2000);

        CarDetails randomCar = carDealer.showRandomCar();

        carDealer.sellCarToBuyer(randomCar, wiesiu);

        townHall.listAllRegisteredCars();
        carDealer.listDealerTransactions();
    }
}
