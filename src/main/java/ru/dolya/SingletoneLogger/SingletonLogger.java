package ru.dolya.SingletoneLogger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {

    private volatile static SingletonLogger instance;

    private SingletonLogger() { }

    public static SingletonLogger getInstance() {
        if (instance == null) {
            synchronized (SingletonLogger .class) {
                if (instance == null) {
                    instance = new SingletonLogger();
                }
            }
        }
        return instance;
    }

    public void log (Object obj, String info){
        LocalDate today = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = today.format(dateTimeFormatter);
        System.out.println("Log info: " + formattedDate + " - " + obj.getClass().getSimpleName() + " - " + info);
    }

}
