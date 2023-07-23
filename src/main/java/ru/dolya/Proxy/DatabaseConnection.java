package ru.dolya.Proxy;

//Создание класса который хранит название бд и "подключается" к ней по полному url.
//        Подключаться через proxy, который добавляет к названию полный адрес.
//        (через proxy обращаюсь к названию бд, вижу строчку подключено localhost:port/название бд)

//Да, только мне кажется адрес БД передаётся извне, то есть localhost и port это входные параметры.
//А прокси класс уже складывает это в одну строку localhost + port + название БД и выводит на экран
public class DatabaseConnection {
    private final String dbName;

    public DatabaseConnection(String dbName) {
        this.dbName = dbName;
    }

    public void connect() {
        String fullURL = "jdbc:postgresql://localhost:5432/";
        System.out.println("Connected to DB: " + fullURL + dbName);
    }

}