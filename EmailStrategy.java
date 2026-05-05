public class EmailStrategy implements NotificationStrategy {
    public void send(String message, String recipient) {
        System.out.println("[EMAIL] " + recipient + " -> " + message);
    }
}