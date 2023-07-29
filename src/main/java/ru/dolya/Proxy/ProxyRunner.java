package ru.dolya.Proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnector("http://localhost:8080");
        dbConnection.connect("http://localhost:8080/my_database");
        DatabaseConnection dbProxy = new ProxyDatabaseConnector(dbConnection);
        dbProxy.connect("my_database");
    }
}