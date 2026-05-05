public class NotificationFactory {

    public static Notification createNotification(String type) {

        if (type.equals("email")) {
            return new EmailNotification();
        } else if (type.equals("sms")) {
            return new SmsNotification();
        } else if (type.equals("push")) {
            return new PushNotification();
        }

        return null;
    }
}