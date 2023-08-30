package org.example.model;

public class Car {
    private String name;
    private int release;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private Body body;

    public Car(String name, int power, Transmission transmission, Wheels wheels, Body body) {
        this.name = name;
        this.release = power;
        this.transmission = transmission;
        this.wheels = wheels;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return release;
    }

    public void setPower(int power) {
        this.release = power;
    }
}
