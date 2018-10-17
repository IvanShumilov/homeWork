package ru.shumilov.ia.stock;

import ru.shumilov.ia.transport.Transport;

public class Depot {
    private int index;
    private boolean busy;
    private int speedLoad;
    private int timeBusy;
    private int distace;

    Depot(int index, int speedLoad, int distance) {
        this.index = index;
        this.speedLoad = speedLoad;
        this.distace = distance;
    }

    public synchronized void setJob(Transport transport) {
        busy = true;
        int storage = transport.getStorage();
        timeBusy = storage / speedLoad + distace / transport.getSpeed();
        System.out.println("depot busy the " + transport.getType() + " on " + timeBusy);


        Thread thread = new Thread(() -> {
            do {
                if (timeBusy > 0) {
                    timeBusy-=10;
                    System.out.println("depot " + index + " busy on " + timeBusy);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    busy = false;
                    System.out.println("the depot " + index + " is free");
                }
            }while (busy);
        });

        thread.start();
    }

    public boolean isBusy() {
        return busy;
    }
}
