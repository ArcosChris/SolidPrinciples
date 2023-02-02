package com.solidprinciples.ISP;

/**
 * Birds have the ability to fly, swim and eat. So now we can implement
 * all the interfaces needed for the actions the bird can perform.
 * ISP tells us it is best not force any class to implement to interface if it
 * does not pertain to it.
 * */
class BirdISP implements Flyable, Eatable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Fish do not fly but I do1");
    }

    @Override
    public void eat() {
        System.out.println("I love eating worms.");
    }

    @Override
    public void swim() {
        System.out.println("I do not swim all the time but when I do, I do it.");
    }
}