package ru.shumilov.ia.transport;

public final class Truck extends Transport {


    public Truck(int storage) {
        super(storage);
        setType("Truck");
        setSpeed(20);
    }
}
