public class SmsNotification implements Notification {

    public void send(String message, String recipient) {
        System.out.println("SMS to " + recipient + ": " + message);
    }
}