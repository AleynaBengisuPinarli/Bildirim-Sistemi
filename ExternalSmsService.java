public class ExternalSmsService {
    public void sendSms(String phone, String message) {
        System.out.println("[External API] SMS -> " + phone + " : " + message);
    }
}