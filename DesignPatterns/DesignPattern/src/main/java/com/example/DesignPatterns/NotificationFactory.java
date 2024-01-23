package DesignPattern.src.main.java.com.example.DesignPatterns;

public class NotificationFactory {
    public NotificationFactory()
    {}

    public Notification getNotification(String type)  {
        Notification noti;
        switch (type)
        {
            case "sms":
                noti = new SmsNotification();
            case "email":
                noti = new EmailNotification();
            default :
                noti = new SmsNotification();
        }
        return noti;

    }
}
