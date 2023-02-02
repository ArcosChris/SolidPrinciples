package com.solidprinciples.LSP;

import java.util.ArrayList;
import java.util.List;

class DMV {
    private String state;
    private List<Vehicle> registeredVehicles = new ArrayList<>();

    public DMV(String state) {
        setState(state);
    }

    //RegisterVehicle wants a Vehicle object, but we have the ability to pass in car, boat or motorcycle
    public void registerVehicle(Vehicle vehicle){
        registeredVehicles.add(vehicle);
        System.out.printf("%s with VIN: %s has been registered\n", vehicle.getClass().getSimpleName(), vehicle.getVin());
        System.out.println("Please do not forget to pay your fee at your local office. You have 60 days to pay\n");
    }

    private void setState(String state) {
        this.state = state;
    }

    public List<Vehicle> getRegisteredVehicles() {
        return registeredVehicles;
    }

    private void setRegisteredVehicles(List<Vehicle> registeredVehicles) {
        this.registeredVehicles = registeredVehicles;
    }

    @Override
    public String toString() {
        return "DMV{" +
                "state='" + state + '\'' +
                '}';
    }
}