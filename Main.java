import Facade2.NotificationService;

public class Main {
    public static void main(String[] args) {
        
        NotificationService service = new NotificationService();
        service.send("Hello World", "username");
        service.send("Hello ererw", "username2");
        
    }
}
