package ru.shumilov.ia.stock;

import ru.shumilov.ia.transport.Transport;

class Depot {
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

    void setJob(Transport transport) {
        busy = true;
        int storage = transport.getStorage();
        timeBusy = storage / speedLoad + distace / transport.getSpeed();
        System.out.println("depot " + index + " busy the " + transport.getType() + " on " + timeBusy);


        Thread thread = new Thread(() -> {
            do {
                if (timeBusy > 0) {
                    timeBusy-=100;
                    System.out.println("depot " + index + " busy on " + timeBusy);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    busy = false;
                    transport.setDone(true);
                    System.out.println("the depot " + index + " is free");
                    break;
                }
            }while (busy);
        });

        thread.start();
    }

    boolean isBusy() {
        return busy;
    }
}
