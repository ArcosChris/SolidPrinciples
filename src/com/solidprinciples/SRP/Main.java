package com.solidprinciples.SRP;

class Main {

    public static void main(String[] args) {

        CarSRP myCar = new CarSRP();
        // The only responsibility of Car is to drive
        myCar.drive("Mexico");
        //Here we have the Radio to changeMusic which is the only responsibility of the RADIOSRP Class
        myCar.getRadio().changeMusic("A Thousand Miles");
    }
}