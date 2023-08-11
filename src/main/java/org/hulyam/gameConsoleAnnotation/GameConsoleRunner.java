package org.hulyam.gameConsoleAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameConsoleRunner {
    public static void main(String[] args) {

        // to specify the XML configuration file:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("gameConsoleAnnotationContext.xml");

        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
