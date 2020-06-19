package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarDealer {
    private final List<Car> cars = new ArrayList<>();
    private List<Transaction> transactionsHistory = new ArrayList<>();
    private int money = 100000;

    private static final int CAR_COMMISSION_PERCENTAGE = 125;

    public List<Car> getCars() {
        return cars;
    }

    public void importCarsFromAbroad(int amountOfCarsToBuy, int priceOfCarsToBuy) {
        this.money =  money - amountOfCarsToBuy * priceOfCarsToBuy;

        Random r = new Random();

        while (amountOfCarsToBuy > 0) {
            Car importedCars = new Car("Fiat", "126");

            int importedCarValue = r.ints(1, priceOfCarsToBuy, priceOfCarsToBuy * CAR_COMMISSION_PERCENTAGE / 100).findFirst().getAsInt();

            importedCars.setValue(importedCarValue);
            importedCars.setPlates(TownHall.registerNewCar());

            cars.add(importedCars);

            int randomYear;

            if (priceOfCarsToBuy < 5000) {
                randomYear = r.ints(1, 1990, 2000).findFirst().getAsInt();
            } else {
                randomYear = r.ints(1, 2000, 2020).findFirst().getAsInt();
            }

            importedCars.setYearOfProduction(randomYear);

            amountOfCarsToBuy--;
        }
    }

    public void buyCar(Car car) {

    }

    public void sellCar(Car car) {

    }
}
