package ru.dolya.Proxy;

public interface DatabaseConnection {
    void connect(String database);

    String getUrl();
}