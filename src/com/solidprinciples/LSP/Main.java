package com.solidprinciples.LSP;

class Main {
    public static void main(String[] args) {
        DMV ctDMV = new DMV("Connecticut");

        Car myCar = new Car();
        Boat myBoat = new Boat();
        Motorcycle myMotorcycle = new Motorcycle();


        ///BUT REGISTERVEHICLE() EXPECTS A VEHICLE!!!
        // CAR, BOAT and MOTORCYCLE ARE VEHICLE SUBCLASSES so this is okay
        ctDMV.registerVehicle(myCar);
        ctDMV.registerVehicle(myBoat);
        ctDMV.registerVehicle(myMotorcycle);
    }
}