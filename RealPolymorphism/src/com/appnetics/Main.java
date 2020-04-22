package com.appnetics;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());



        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Ford Ranger. 4WD");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Starting engine in cr class";
    }

    public String accelerate(){
        return "Accelerating vehicle in car class";
    }

    public String brake(){
        return "Braking car in car class";
    }

}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Starting engine at mitsubishi";
    }

    @Override
    public String accelerate() {
        return "Accelerating at Mitsubishi";
    }

    @Override
    public String brake() {
        return "Braking at Mitsubishi";
    }
}

