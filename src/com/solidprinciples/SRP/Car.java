package com.solidprinciples.SRP;


/*
* This is not a good implementation of the Single Responsibility Principle
* SRP States that a class should only have one reason to change, meaning it should only have one responsibility.
*/
class Car {
    private String songPlaying;
    private String location;

    public Car(String songPlaying, String location) {
        this.songPlaying = songPlaying;
        this.location = location;
    }

    //Action methods
    // This is violating the SRP!! OH NOO...
    // Now the Car class is responsible for drive and the change music functionality?? This is not right.
    //This is violating SRP because the class has Multiple Responsibilities that could change independently of each other.
    public void drive(String location){
        setLocation(location);
        System.out.printf("Driving to %s", location);
    }

    public void changeMusic(String newSong){
        setSongPlaying(newSong);
        System.out.printf("Changing the song to %s", newSong);
    }

    public String getSongPlaying() {
        return songPlaying;
    }

    private void setSongPlaying(String songPlaying) {
        this.songPlaying = songPlaying;
    }

    public String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }
}