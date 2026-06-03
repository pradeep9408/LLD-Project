package notifications;

import interfaces.NotificationService;

public class SmsNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("SMS Notification : " + message);
    }
}