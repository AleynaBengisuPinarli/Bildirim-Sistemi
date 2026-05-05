public class NotificationService {

    public void sendNotification(String type, String message, String recipient) {

        if (type.equals("email")) {
            System.out.println("Sending EMAIL to " + recipient);

        } else if (type.equals("sms")) {
            System.out.println("Sending SMS to " + recipient);

        } else if (type.equals("push")) {
            System.out.println("Sending PUSH to " + recipient);

        } else {
            System.out.println("Unknown type");
        }
    }
}