package main;

import java.util.Scanner;

public class Customers {
    public int customerId;
    public String firstName;
    public String lastName;
    public double amountOfMoney;

    public Customers(int id, String firstName, String lastName, double amountOfMoney) {
        this.customerId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }
    public int getId() {
        return customerId;
    }
    public void setId(int id) {
        this.customerId = id;
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
    public double isAmountOfMoney() {
        return amountOfMoney;
    }
    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id='" + customerId + '\'' +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
