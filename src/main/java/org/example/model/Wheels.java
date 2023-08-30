package org.example.model;

public class Wheels {
    private String name;
    private int radius;
    private int hook;

    public Wheels(String name, int radius, int hook){
        this.name = name;
        this.radius = radius;
        this.hook = hook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHook() {
        return hook;
    }

    public void setHook(int hook) {
        this.hook = hook;
    }
}
