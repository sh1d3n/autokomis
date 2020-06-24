package com.project;

import java.util.ArrayList;
import java.util.List;

public class TownHall {
    private final List<Car> registeredCars = new ArrayList<>();
    private int lastRegisteredPlate = 0;

    public Integer registerNewCar(String owner) {
        Integer platesForNewCar = ++lastRegisteredPlate;

        registeredCars.add(new Car(platesForNewCar, owner));

        return platesForNewCar;
    }

    public void unregisterCar(Integer plates) {
        for (Car car : registeredCars) {
            if (car.getPlates().equals(plates)) {
                registeredCars.remove(car);
            }
        }
    }

    public void listAllRegisteredCars() {
        System.out.println("Currently registered cars: ");
        for (Car car : registeredCars) {
            System.out.println(car);
        }
    }

    public void changeOwnerOfCar(int plates, String newOwner) {
        for (Car car : registeredCars) {
            if (car.getPlates().equals(plates)) {
                car.setOwner(newOwner);
            }
        }
    }
}
