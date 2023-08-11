package org.hulyam.databaseXmlContext;

public class PostgreSql extends Database {
    @Override
    public void log() {
        System.out.println("Logged to PostgreSql.");
        System.out.println("Connected to " + url);
        System.out.println("Username: " + username);
    }
}
