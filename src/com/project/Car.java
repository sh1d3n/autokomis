package com.project;

public class Car {

    private Integer plates;
    private String owner;

    public Car() { }

    public Car(Integer plates, String owner) {
        this.plates = plates;
        this.owner = owner;
    }

    public Integer getPlates() {
        return plates;
    }

    public void setPlates(Integer plates) {
        this.plates = plates;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plates=" + plates +
                ", owner='" + owner + '\'' +
                '}';
    }
}
