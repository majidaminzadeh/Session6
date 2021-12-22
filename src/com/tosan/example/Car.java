package com.tosan.example;

public class Car extends Vehicle implements com.tosan.example.MyInterface, com.tosan.example.MyInterface2{
    // car is-a vehicle
    private Engine engine; // car has-a engine
    public void move() {
        System.out.println("Moving");
    }

    public String stop() {
        return "Stop";
    }

    @Override
    public void print() {

    }
}
