package DesignPattern.src.main.java.com.example.DesignPatterns;

public class SmsNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("Sms Notification");
    }
}
