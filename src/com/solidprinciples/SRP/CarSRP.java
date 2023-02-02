package com.solidprinciples.SRP;

/*
* Since the SRP states that a class should only have one reason to change,
* meaning it should only have one responsibility
* In this example the car only has one responsibility which is to drive
* The radio class handles the change music functionality and the car class
* just pushes it over to the Radio class
* */

//GO TO MAIN TO SEE HOW THESE WORK TOGETHER (RADIO AND CAR)
class CarSRP {
    private final RadioSRP radio;
    private String location;
    public CarSRP() {
        this.radio = new RadioSRP();
    }

   // In this example the Car class now follows SRP because Car only has the one responsibility (Drive)
   // we have access to the Radio instance with our getter to be able to change the music
    public void drive(String location){
        setLocation(location);
        System.out.printf("Driving to %s", location);
    }

    public RadioSRP getRadio() {
        return radio;
    }

    public String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }
}