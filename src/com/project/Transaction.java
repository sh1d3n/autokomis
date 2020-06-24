package com.project;

import java.time.LocalDateTime;

public class Transaction {
    private CarDetails carDetails;
    private Integer price;
    private LocalDateTime transactionDate;
    private String details;

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "carDetails=" + carDetails +
                ", price=" + price +
                ", transactionDate=" + transactionDate +
                ", details='" + details + '\'' +
                '}';
    }
}
