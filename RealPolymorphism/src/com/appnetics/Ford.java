package com.appnetics;

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Starting engine at ford";
    }

    @Override
    public String accelerate() {
        return "Accelerating at ford";
    }

    @Override
    public String brake() {
        return "Braking at ford";
    }
}

