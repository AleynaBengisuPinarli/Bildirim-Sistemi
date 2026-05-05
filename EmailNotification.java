public class EmailNotification implements Notification {

    public void send(String message, String recipient) {
        System.out.println("EMAIL to " + recipient + ": " + message);
    }
}