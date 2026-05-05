public class Main {
    public static void main(String[] args) {

        // FAZ 1 - Factory Pattern
        NotificationService service = new NotificationService();

        service.sendNotification("email", "Hello", "test@mail.com");
        service.sendNotification("sms", "Hi", "555123");

        // FAZ 3 - Strategy Pattern
        NotificationContext context = new NotificationContext();
        context.setStrategy(new EmailStrategy());
        context.send("Merhaba", "ali@mail.com");

        context.setStrategy(new SmsStrategy());
        context.send("Selam", "555123");

        // FAZ 3 - Observer Pattern
        NotificationCenter center = new NotificationCenter();
        center.addObserver(new User("Ali"));
        center.addObserver(new User("Ayşe"));

        center.notifyAllUsers("Yeni bildirim var!");
    }
}