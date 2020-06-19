package com.project;

import java.util.ArrayList;
import java.util.List;

public class TownHall {
    private static final List<Integer> registeredPlates = new ArrayList<>();
    private static int lastRegisteredPlate = 0;

    public static Integer registerNewCar() {
        Integer platesForNewCar = ++lastRegisteredPlate;

        registeredPlates.add(platesForNewCar);

        return platesForNewCar;
    }

    public static void unregisterCar(Integer plates) {
        registeredPlates.remove(plates);
    }

    public static List<Integer> getRegisteredPlates() {
        return registeredPlates;
    }
}
