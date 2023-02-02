package com.solidprinciples.DIP;

/**
 * Creating an interface so the Manager class does not have to depend on a concrete implementation.
 * */
public interface Worker {
    void work();
}


/**
 * EmployeeDIP implements Worker interface which requires us to write implementation logic for the WORK() method
 * Now Manager will not depend on the Concrete implementation on Employee class.
 */

class EmployeeDIP implements Worker{
    @Override
    public void work() {
        System.out.println("Employee: Working hard everyday.");
    }
}


/**
 * The Manager class is no longer dependent on the concrete implementation of Employee. Instead, we depend on a non-concrete implementation
 * (Worker Interface).
 * This helps keep code flexible and maintainable. Now you can change the implementation of the Employee class without messing with Manager class.
 */
class ManagerDIP {
    Worker worker;

    public ManagerDIP() {
        this.worker = new EmployeeDIP();
    }

    public void manage(){
        this.worker.work();
        System.out.println("Manager: Watching you work");
    }
}