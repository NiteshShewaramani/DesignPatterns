package DesignPattern.src.main.java.com.example.DesignPatterns;

import java.util.List;

public class DesignPatterns {
    public static void main(String[] args) {
        //factory pattern
        NotificationFactory nf = new NotificationFactory();
        Notification   n = nf.getNotification("email");
        n.notifyMessage();
        //to do builder pattern
        BuilderPattern bp = BuilderPattern.createBuilderInstance();
        SubwaySub sub= bp
                .addBun("toastedGalicCheese")
                .addSause(List.of("mayo","chipotle","barbeque"))
                .addVeggies(List.of("corn","capcicum","tomato"))
                .build();

        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC")
                .setHasBike(false)
                .setHasBike(true).build();
        

    }
}
