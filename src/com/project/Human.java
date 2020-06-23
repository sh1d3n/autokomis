package com.project;

public class Human {

    private CarDetails carDetails;

    private String firstName;
    private String lastName;

    private Integer money = 1000;

    public Human(String firstName, String lastName, Integer money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
