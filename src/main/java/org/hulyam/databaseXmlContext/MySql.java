package org.hulyam.databaseXmlContext;

public class MySql extends Database {
    @Override
    public void log() {
        System.out.println("Connected to " + url);
        System.out.println("Username: " + username);
        System.out.println("Logged to MySql.");
    }
}
