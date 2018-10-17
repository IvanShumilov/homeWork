package ru.shumilov.ia.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private int distance;
    private List<Depot> depotList = new ArrayList<>();

    public Stock(int distance, int collDepot) {
        this.distance = distance;
        for (int i = 1; i <= collDepot; i++){
            depotList.add(new Depot(i, (int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1)));
        }
    }


    public List<Depot> getDepotList() {
        return depotList;
    }
}
