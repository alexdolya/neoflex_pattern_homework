package ru.dolya.Proxy;


public class DatabaseConnector implements DatabaseConnection {
    private final String url;

    public DatabaseConnector(String url) {
        this.url = url;
    }

    @Override
    public void connect(String database) {
        System.out.println("Connected to " + database);
    }

    @Override
    public String getUrl() {
        return url;
    }


}