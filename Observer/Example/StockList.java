package Observer.Example;

import java.util.ArrayList;
import java.util.List;

public class StockList implements Observer {

    List<Double> stockList = new ArrayList<>();

    @Override
    public void update(Double value) {
        stockList.add(value);
        System.out.println("StockList: " + stockList);
    }
    
}
