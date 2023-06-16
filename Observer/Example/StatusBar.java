package Observer.Example;

public class StatusBar implements Observer {


    @Override
    public void update(Double value) {
        System.out.println("StatusBar: " + value);
    }
    
}
