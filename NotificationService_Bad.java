public class NotificationService_Bad {

    public void sendNotification(String type, String message, String recipient) {

        if (type.equals("email")) {
            System.out.println("EMAIL to " + recipient + ": " + message);
        }
        else if (type.equals("sms")) {
            System.out.println("SMS to " + recipient + ": " + message);
        }
        else if (type.equals("push")) {
            System.out.println("PUSH to " + recipient + ": " + message);
        }
    }
}