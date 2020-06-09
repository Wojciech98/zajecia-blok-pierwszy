package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

import java.util.List;

public class Phone extends Device {


    public String model;
    public static final String appName = "Game";
    public static final String version = "1.1";
    public static final String serverAddress = "8080";
    public List<String> appList;
    public URL url;
    public static


    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("I don't have an animal for sale");
                } else {
                    System.out.println("I  have an animal for sale");

                }

                if (seller.getMyGarage(1) == null) {
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
        System.out.println("Turn On phone");
        return true;
    }

    public String getModel() {
        return model;
    }

    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }


    public void setModel(String model) {
        this.model = model;
    }
}
