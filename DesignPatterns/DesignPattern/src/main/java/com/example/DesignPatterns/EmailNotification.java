package DesignPattern.src.main.java.com.example.DesignPatterns;

public class EmailNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("Email Notification");
    }
}
