public class SmsStrategy implements NotificationStrategy {
    public void send(String message, String recipient) {
        System.out.println("[SMS] " + recipient + " -> " + message);
    }
}