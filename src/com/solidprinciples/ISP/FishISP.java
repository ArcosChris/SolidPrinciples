package com.solidprinciples.ISP;

/*
*Fish cant fly, but they are great at eating and swimming
* Interface Segregation Principle tells us that a class should not be forced to
* implement methods in an interface that do not pertain to them.
*
* In our situation we broke up the Animal Interface and created different interfaces
* for different actions some (not all) animals can do.
* If it DOES NOT pertain to the animal just don't implement it :)
* */

class FishISP implements Eatable, Swimmable{
    @Override
    public void eat() {
        System.out.println("I love to eat.");
    }

    @Override
    public void swim() {
        System.out.println("I was an olympic swimmer once.");
    }
}