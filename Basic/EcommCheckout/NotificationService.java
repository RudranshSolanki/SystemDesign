public interface NotificationService {
    void send(String message);
}

class EmailService implements NotificationService{
    public void send(String message){
        System.out.println("Email Sent: " + message);
    }

}
class SmsService implements NotificationService{
    public void send(String message){
        System.out.println("SMS Sent: "+ message);
    }
}

class NotificationMethod{
    void NotificationSender(NotificationService notificationService,String message){
        notificationService.send(message);
    }
}
