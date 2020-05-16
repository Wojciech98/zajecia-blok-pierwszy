package com.company;


import com.company.devices.Car;

import java.util.Date;

public class Human {

    Animal pet;
    private Car myCar;
    Double salary=1.0;

    Date date = new Date();

public String toString(){
    return pet+" "+myCar+"  "+salary;
}
    void addMyCar(Car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("value must be positive");
        } else {
            System.out.println("New salary send to bookkeeping ");
            System.out.println("You must take annex to the contract from Hania");
            System.out.println("Zus and US now know payout changes ");

            return salary;
        }
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        if(salary>=myCar.price) {
            System.out.println("You can buy new car!");
            addMyCar(myCar);
        }else if (salary>(myCar.price/12)){
            System.out.println("You can buy new car for credit");
            addMyCar(myCar);
        }else {
            System.out.println("You don't have enough money");
        }
    }

    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }
}
