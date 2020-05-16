package com.company.devices;

public class Phone extends Device {


    public String toString(){
        return "";
    }

    @Override
    public boolean turnOn() {
        System.out.println("Turn On");
        return true;
    }
}
