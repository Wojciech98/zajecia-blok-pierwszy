package com.company.devices;

import com.company.Animal;
import com.company.Human;
import com.company.Salleable;

public class Car extends Device {


    public String model;
    public String producer;
    public String colour;
    public int price = 300;

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("I don't have an animal for sale");
                } else {
                    System.out.println("I  have an animal for sale");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("I don't have a car for sale");
                } else {
                    System.out.println("I  have a car for sale");
                    buyer.setCash(-price);
                    buyer.setMyCar(seller.getMyCar());
                    seller.setCash(+price);
                }

                if (seller.getPhone() == null) {
                    System.out.println("I don't have a phone for sale");
                } else {
                    System.out.println("I  have a phone for sale");
                }
            }else {
                System.out.println("You do not have enough money");
            }


        }

    };

    public String toString() {

        return model + " " + price + " " + colour + " " + producer;
    }

    @Override
    public boolean turnOn() {
        System.out.println("Turn On");
        return true;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColour() {
        return colour;
    }
}
