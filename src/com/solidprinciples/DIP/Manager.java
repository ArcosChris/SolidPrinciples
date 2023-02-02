package com.solidprinciples.DIP;

/**
 *This is an example of not using Dependency Inversion Principle
 * */
class Employee{
    public void work(){
        System.out.println("Employee: Doing Work");
    }
}

/**
 * This is not good practice we are dependent on the Employee class which is a low level module.
 * Manager class is dependent on Employee and if the Employee class needs to change any functionality this could break
 * the Manager class and cause big issues.
 */
class Manager {
    Employee emp;

    public Manager() {
        this.emp = new Employee();
    }

    public void manage(){
        this.emp.work();
        System.out.println("Manager: Watching you do work.");
    }
}