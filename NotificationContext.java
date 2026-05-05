public class NotificationContext {

    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send(String message, String recipient) {
        strategy.send(message, recipient);
    }
}