package com.project;

import java.util.Random;

public class RandomNumbers {

    private static final Random random = new Random();

    public static int getRandomInt(int minRange, int maxRange) {
        return random.ints(1, minRange, maxRange).findFirst().getAsInt();
    }
}
