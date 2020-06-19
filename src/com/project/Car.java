package com.project;

public class Car {

    private final String producer;
    private final String model;
    private Integer plates;
    private Integer yearOfProduction;
    private Integer value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Integer getPlates() {
        return plates;
    }

    public void setPlates(Integer plates) {
        this.plates = plates;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", plates=" + plates +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
