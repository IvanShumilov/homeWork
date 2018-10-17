package ru.shumilov.ia;

import ru.shumilov.ia.stock.RemoteControl;
import ru.shumilov.ia.stock.Stock;
import ru.shumilov.ia.transport.Train;
import ru.shumilov.ia.transport.Truck;

public class Main {

    public static void main(String[] args) {

        Train train1 = new Train(10000);
        Truck truck1 = new Truck(200);
        Train train2 = new Train(10000);
        Truck truck2 = new Truck(200);
        Train train3 = new Train(10000);
        Truck truck3 = new Truck(200);
        Train train4 = new Train(10000);
        Truck truck4 = new Truck(200);
        Stock stock = new Stock(10, 2);

        RemoteControl remoteControl = new RemoteControl(stock, train1, train2, train3, train4, truck1, truck2, truck3, truck4);
        remoteControl.start();


    }
}
