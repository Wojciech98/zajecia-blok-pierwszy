package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

public class Phone extends Device {


    public String model;
    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("I don't have an animal for sale");
                } else {
                    System.out.println("I  have an animal for sale");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("I don't have a car for sale");
                } else {
                    System.out.println("I  have a car for sale");
                }

                if (seller.getPhone() == null) {
                    System.out.println("I don't have a phone for sale");
                } else {
                    buyer.setCash(-price);
                    buyer.setPhone(seller.getPhone());
                    seller.setCash(+price);
                }
            } else {
                System.out.println("You do not have enough money");
            }

        }


    };

    public Phone() {

    }

    public String toString() {
        return "";
    }

    @Override
    public boolean turnOn() {
        System.out.println("Turn On");
        return true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
