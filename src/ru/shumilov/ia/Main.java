package ru.shumilov.ia;

import ru.shumilov.ia.stock.Depot;
import ru.shumilov.ia.stock.Stock;
import ru.shumilov.ia.transport.Train;
import ru.shumilov.ia.transport.Truck;

public class Main {

    public static void main(String[] args) {

        Train train1 = new Train(1000);
        Truck truck1 = new Truck(20);

        Stock stock = new Stock(10,4);

        for(Depot i: stock.getDepotList()){
            if(!i.isBusy()){
                i.setJob(train1);
            }
            if(!i.isBusy()){
                i.setJob(truck1);
            }
        }

        int flag;
        do {
            flag = 0;
            for (Depot i : stock.getDepotList()) {
                if (i.isBusy()) {
                    flag++;
                }
            }
        }while(flag != 0);

    }
}
