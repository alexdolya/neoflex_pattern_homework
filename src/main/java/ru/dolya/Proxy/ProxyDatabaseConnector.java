package ru.dolya.Proxy;


public class ProxyDatabaseConnector implements DatabaseConnection {
    private final DatabaseConnection databaseConnection;

    public ProxyDatabaseConnector(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public void connect(String database) {
        System.out.println("Connected by proxy to " + databaseConnection.getUrl() + "/" + database);
    }

    @Override
    public String getUrl() {
        return databaseConnection.getUrl();
    }
}