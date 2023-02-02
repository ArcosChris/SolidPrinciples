package com.solidprinciples.LSP;

import java.util.UUID;

/**
 * Realistically these would all be separate files but in order to keep it organized I decided to put it in one file.
 * the Vehicle class is a super class and Car, Boat, Motorcycle are subclasses of Vehicle
 *
 * LSP states that anywhere that an object of a superclass(Vehicle) is expected it should be able to be replaced with objects
 * of a subclass (Car, Boat, Motorcycle).
 */

// GO TO THE DMV CLASS -> Then MAIN

abstract class Vehicle {
    private final String vin;
    public Vehicle(){
        vin = UUID.randomUUID().toString();
    }
    public abstract void  go();

    public String getVin() {
        return vin;
    }
}

class Car extends Vehicle{
    @Override
    public void go() {
        System.out.printf("The %s is going on the road", getClass().getSimpleName());
    }
}

class Boat extends Vehicle{

    @Override
    public void go() {
        System.out.printf("The %s is going in ocean", getClass().getSimpleName());
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void go() {
        System.out.printf("The %s is going on the road really fast", getClass().getSimpleName());
    }
}