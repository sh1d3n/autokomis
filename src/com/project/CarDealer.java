package com.project;

import java.util.ArrayList;
import java.util.List;

public class CarDealer implements Dealerable {
    private final List<CarDetails> ownedCars = new ArrayList<>();
    private final List<Transaction> transactionsHistory = new ArrayList<>();

    private final TownHall townHall;

    private int money = 100000;

    private static final int CAR_COMMISSION_PERCENTAGE = 125;

    public CarDealer(TownHall townHall) {
        this.townHall = townHall;
    }

    @Override
    public void importCarsFromAbroad(int amountOfCarsToBuy, int priceOfCarsToBuy) {
        this.money =  money - amountOfCarsToBuy * priceOfCarsToBuy;

        while (amountOfCarsToBuy > 0) {
            CarDetails importedCar = new CarDetails("Fiat", "126");

            int importedCarValue = RandomNumbers.getRandomInt(priceOfCarsToBuy, priceOfCarsToBuy * CAR_COMMISSION_PERCENTAGE / 100);

            importedCar.setValue(importedCarValue);

            String carOwner = "Car Dealer";

            importedCar.setOwner(carOwner);
            importedCar.setPlates(townHall.registerNewCar(carOwner));

            ownedCars.add(importedCar);

            int randomYear;

            if (priceOfCarsToBuy < 5000) {
                randomYear = RandomNumbers.getRandomInt(1990, 2000);
            } else {
                randomYear = RandomNumbers.getRandomInt(2000, 2020);
            }

            importedCar.setYearOfProduction(randomYear);

            amountOfCarsToBuy--;
        }
    }

    @Override
    public void buyCar(CarDetails carDetails) {

    }

    @Override
    public void sellCar(CarDetails carDetails) {

    }
}
