public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.sendNotification("email", "Hello", "test@mail.com");
        service.sendNotification("sms", "Hi", "555123");
    }
}