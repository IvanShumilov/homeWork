package ru.shumilov.ia.transport;

public abstract class Transport {
    private String type;
    private int storage;
    private int speed;

    Transport(int storage) {
        this.storage = storage;
    }

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public int getStorage() {
        return storage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
