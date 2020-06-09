package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

public abstract class Car extends Device {


    public String model;
    public String producer;
    public String colour;
    public int price = 300;
    public int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract String refuel();

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {


                if (seller.getMyGarage(0) != null) {
                    System.out.println("I have car for you");


                        if (buyer.getMyGarage(0) == null) {

                            if (buyer.getCash() > price) {

                                seller.setCash(+price);
                                buyer.setCash(-price);
                                System.out.println("You buy car");

                            } else {
                                System.out.println("You do not have enough cash");
                            }
                        } else {
                            System.out.println("I don't have free space");
                        }


                } else {
                    System.out.println("I don't have a car for sale");
                }
            }




    };
//                if (seller.getMyGarage(1) == null) {
//                    System.out.println("I don't have a car for sale");
//                } else {
//                    System.out.println("I  have a car for sale");
//                    buyer.setCash(-price);
//                   // buyer.setMyCar(seller.getMyCar(1));
//                    seller.setCash(+price);
//                }
//
//                if (seller.getPhone() == null) {
//                    System.out.println("I don't have a phone for sale");
//                } else {
//                    System.out.println("I  have a phone for sale");
//                }

    public String toString() {

        return model + " " + price + " " + colour + " " + producer;
    }

    @Override
    public boolean turnOn() {
        System.out.println("Turn On");
        return true;
    }

    public double getPrice() {
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
