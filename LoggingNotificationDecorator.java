public class LoggingNotificationDecorator extends NotificationDecorator {

    public LoggingNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message, String recipient) {
        System.out.println("[LOG] Başlıyor...");
        super.send(message, recipient);
        System.out.println("[LOG] Bitti");
    }
}