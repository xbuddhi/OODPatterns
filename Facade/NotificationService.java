package Facade;

public class NotificationService {
    NotificationServer server = new NotificationServer();
    Connection connection = server.connect("ip");

    public void send(String message, String target) {
        server.authenticate("14231231", "123123");
        server.send(new AuthToken(), new Message(message), target);
        connection.disconnect();
        System.out.println("Sent the message to " + target + ": " + message);
    }
}
