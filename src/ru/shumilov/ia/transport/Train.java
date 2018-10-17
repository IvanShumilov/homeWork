package ru.shumilov.ia.transport;

public final class Train extends Transport {


    public Train(int storage) {
        super(storage);
        setType("Train");
        setSpeed(5);
    }

}
