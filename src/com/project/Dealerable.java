package com.project;

public interface Dealerable {
    void importCarsFromAbroad(int amountOfCarsToBuy, int priceOfCarsToBuy);
    void buyCarFromSeller(Human seller);
    void sellCarToBuyer(CarDetails carDetails, Human buyer);
    void listDealerTransactions();

    CarDetails showMostExpensiveCar();
    CarDetails showCheapestCar();
    CarDetails showRandomCar();
}
