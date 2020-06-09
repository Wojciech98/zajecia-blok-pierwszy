package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Car extends Device  {


    public String model;
    public String producer;
    public String colour;
    public int price = 300;
    public int year;

    public List<Human> carOwner;

    public List<Human> getCarOwner() {
        return carOwner;
    }
    public void setCarOwner(List<Human> carOwner) {
        this.carOwner = carOwner;

    }

    public int countTransactions(){

       return  carOwner.size();
    }

    public void checkCarOnwerInPast(Human human) {



            if (carOwner.equals(human) == true) {
                System.out.println("True");
            } else
                System.out.println("False");

    }


    public void checkCarSellerforBuyer(Human seller,Human buyer) {

        for (Human human: carOwner){
            if(carOwner.equals(seller)&& carOwner.equals(buyer)){
                System.out.println("");
            }
        }
    }



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
                        carOwner.add(buyer);
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
