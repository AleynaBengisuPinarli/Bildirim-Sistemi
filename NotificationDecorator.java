public abstract class NotificationDecorator implements Notification {

    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    public void send(String message, String recipient) {
        notification.send(message, recipient);
    }
}