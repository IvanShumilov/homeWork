package ru.shumilov.ia.stock;

import ru.shumilov.ia.transport.Transport;

public class RemoteControl {
    private Stock stock;
    private Transport[] transports;

    public RemoteControl(Stock stock, Transport... transports) {
        this.stock = stock;
        this.transports = transports;
    }

    public void start() {
        int j = 0;
        do {
            for (Depot i : stock.getDepotList()) {
                if (!i.isBusy() && !transports[j].isBusy() && !transports[j].isDone() && j < transports.length) {
                    i.setJob(transports[j]);
                    transports[j].setBusy(true);
                    if (j < transports.length - 1) {
                        j++;
                    }
                }
            }
        } while (transports.length > j);
    }
}
