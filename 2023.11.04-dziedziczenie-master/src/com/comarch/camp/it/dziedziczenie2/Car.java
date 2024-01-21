package com.comarch.camp.it.dziedziczenie2;

public class Car extends Vehicle {

    public Car(String brand, String model) {
        super(brand);
        System.out.println(brand);
        System.out.println(model);
    }
}
