package notifications;

import interfaces.NotificationService;

public class PushNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("Push Notification : " + message);
    }
}