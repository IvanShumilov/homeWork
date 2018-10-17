package ru.shumilov.ia.transport;

public abstract class Transport {
    private String type;
    private int storage;
    private int speed;
    private boolean busy;
    private boolean done;

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

    void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
