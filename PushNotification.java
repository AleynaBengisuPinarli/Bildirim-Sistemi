public class PushNotification implements Notification {

    public void send(String message, String recipient) {
        System.out.println("PUSH to " + recipient + ": " + message);
    }
}