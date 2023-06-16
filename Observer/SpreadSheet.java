package Observer;

public class SpreadSheet implements Observer{
    DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("SpreadSheet got notified. New value: " + dataSource.getValue());
    }
    
}
