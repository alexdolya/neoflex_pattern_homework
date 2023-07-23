package ru.dolya.Proxy;

public class ProxyDBConnection {
    private final DatabaseConnection databaseConnection;

    public ProxyDBConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void connect(){
        databaseConnection.connect();
    }

}
