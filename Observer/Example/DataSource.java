package Observer.Example;

public class DataSource  extends Subject{
    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
        notifyObservers(value);
    }
    
}
