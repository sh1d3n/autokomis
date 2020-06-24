package com.project;

import java.time.LocalDateTime;
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
    public void buyCarFromSeller(Human seller) {
        if (seller.getCarDetails() != null) {
            CarDetails car = seller.getCarDetails();
            Integer carValue = car.getValue();
            Integer carBuyPrice = carValue - carValue * CAR_COMMISSION_PERCENTAGE / 100;

            if (money > carBuyPrice) {
                money -= carBuyPrice;
                seller.setMoney(seller.getMoney() + carBuyPrice);

                seller.setCarDetails(null);
                ownedCars.add(car);

                String carOwner = "Car Dealer";

                townHall.changeOwnerOfCar(car.getPlates(), carOwner);

                Transaction transaction = new Transaction();
                transaction.setCarDetails(car);
                transaction.setPrice(carBuyPrice);
                transaction.setTransactionDate(LocalDateTime.now());
                transaction.setDetails("Car dealer bought car from individual seller");

                transactionsHistory.add(transaction);

                System.out.println(transaction);
            }
        } else {
            System.out.println("You don't have a car to sell!");
        }
    }

    @Override
    public void sellCarToBuyer(CarDetails car, Human buyer) {
        if (ownedCars.contains(car)) {
            if (buyer.getMoney() > car.getValue()) {
                money += car.getValue();
                buyer.setMoney(buyer.getMoney() - car.getValue());

                ownedCars.remove(car);
                buyer.setCarDetails(car);

                townHall.changeOwnerOfCar(car.getPlates(), buyer.getFirstName() + " " + buyer.getLastName());

                Transaction transaction = new Transaction();
                transaction.setCarDetails(car);
                transaction.setPrice(car.getValue());
                transaction.setTransactionDate(LocalDateTime.now());
                transaction.setDetails("Car dealer sold car to individual seller");

                transactionsHistory.add(transaction);

                System.out.println(transaction);
            }
        } else {
            System.out.println("That's not our car!");
        }
    }

    @Override
    public CarDetails showMostExpensiveCar() {
        if (ownedCars.isEmpty()) {
            throw new RuntimeException("Dealers has no cars");
        }

        CarDetails carDetails = null;

        for (CarDetails car : ownedCars) {
            if (carDetails == null || carDetails.getValue() < car.getValue()) {
                carDetails = car;
            }
        }
        return carDetails;
    }

    @Override
    public CarDetails showCheapestCar() {
        if (ownedCars.isEmpty()) {
            throw new RuntimeException("Dealers has no cars");
        }

        CarDetails carDetails = null;

        for (CarDetails car : ownedCars) {
            if (carDetails == null || carDetails.getValue() > car.getValue()) {
                carDetails = car;
            }
        }
        return carDetails;
    }

    @Override
    public CarDetails showRandomCar() {
        if (ownedCars.isEmpty()) {
            throw new RuntimeException("Dealers has no cars");
        }

        int randomInt = RandomNumbers.getRandomInt(0, ownedCars.size() - 1);

        return ownedCars.get(randomInt);
    }

    @Override
    public void listDealerTransactions() {
        System.out.println("Car dealer transactions: ");
        for (Transaction transaction : transactionsHistory) {
            System.out.println(transaction);
        }
    }
}
