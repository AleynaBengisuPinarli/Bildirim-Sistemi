public class SmsAdapter implements Notification {

    private ExternalSmsService service = new ExternalSmsService();

    @Override
    public void send(String message, String recipient) {
        service.sendSms(recipient, message);
    }
}