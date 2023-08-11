package org.hulyam.gameConsoleQualifiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameConsoleRunner {
    public static void main(String[] args) {

        // to specify the XML configuration file:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("gameConsoleQualifiersContext.xml");

        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
