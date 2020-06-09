package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone extends Device {


    public String model;
    public static final String appName = "Game";
    public static final String version = "1.1";
    public static final String serverAddress = "8080";
    public List<Application> appList;
    public Application application;
    public URL url;
    public  Human human;
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

    public void installNewApp(){
        if(human.getCash()>application.price){
            appList.add(application);
            human.setCash(-application.price);
        }
    }

    public  void installed(Application app){
        if(app.equals(application)){
            System.out.println("Application is installed");
        }else
            System.out.println("Application isn't installed");
    }

    public  void installed(String name){
        if(name.equals(application.getName())){
            System.out.println("Application is installed");
        }else
            System.out.println("Application isn't installed");
    }

    public List<Application> freeApplication(Application list){

        for (Application app:appList){
            if (app.price == 0) {
                List<Application> freeApp = new ArrayList<>();

                freeApp.add(list);
                return freeApp;
            }
        }

       return appList;
    }

    public void valueAllApp(){
        double value;
        for(int i = 0 ; i<appList.size();i++){
            value =+ appList.get(i).getPrice();
            System.out.print(value);
        }

    }

    public void sortByAlphabet(){
        java.util.Collections.sort(appList, Collator.getInstance());
    }


    public int compare(Application application, Application application_1)
    {
        return application.getPrice() - application_1.getPrice();
    }


    public List<Application> sortByPrice(){

        Collections.sort(appList, this::compare);
        Collections.reverse(appList);
        System.out.println("Sorted by year");
        for (int i=0; i<appList.size(); i++)
            System.out.println(appList.get(i));

        return appList;
    }



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
