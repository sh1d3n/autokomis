package com.project;

public interface Dealerable {
    void importCarsFromAbroad(int amountOfCarsToBuy, int priceOfCarsToBuy);
    void buyCar(CarDetails carDetails);
    void sellCar(CarDetails carDetails);
}
