package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TownHall {
    private static final List<Car> registeredCars = new ArrayList<>();
    private static int lastRegisteredPlate = 0;

    public static Integer registerNewCar(String owner) {
        Integer platesForNewCar = ++lastRegisteredPlate;

        registeredCars.add(new Car(platesForNewCar, owner));

        return platesForNewCar;
    }

    public static void unregisterCar(Car car) {
        registeredCars.remove(car);
    }

    public static void listAllRegisteredCars() {
        System.out.println("Currently registered cars: ");
        for (Car car : registeredCars) {
            System.out.println(car);
        }
    }
}
