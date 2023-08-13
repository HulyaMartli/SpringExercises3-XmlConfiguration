package org.hulyam.databaseXmlContext;

/*
 * In this example;
 * 1- There should be logging methods in PostgreSql and MySql classes --> e.g. "Logged to PostgreSql"
 * 2- In the Database Service class, there should be a method called logToDatabase; in it, data should
 * be logged to whichever database is being used.
 * 3- Write a databaseContext.xml configuration file to run this application and test it in DatabaseRunner
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("databasePropertyPlaceholderContext.xml");
        DatabaseService databaseService = context.getBean("databaseservice", DatabaseService.class);
        databaseService.logToDatabase();
    }
}
