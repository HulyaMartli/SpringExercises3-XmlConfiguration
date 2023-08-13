package org.hulyam.gameConsoleIoCAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameConsoleRunner {
    public static void main(String[] args) {

        // to specify the configuration file:
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);

        GameRunner gameRunner = context.getBean("gameRunner", GameRunner.class);
        gameRunner.run();
    }
}
