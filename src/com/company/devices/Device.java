package com.company.devices;

public abstract class   Device {


    public String producer;
    public String mode;
    public String yearOfProduction;
    public Double value;


    public String toString(){

        return producer+" "+mode+" "+yearOfProduction;
    }
    public abstract boolean turnOn();
}
