public class NotificationService {

    public void sendNotification(String type, String message, String recipient) {

        Notification notification =
                NotificationFactory.createNotification(type);

        if (notification != null) {
            notification.send(message, recipient);
        }
    }
}