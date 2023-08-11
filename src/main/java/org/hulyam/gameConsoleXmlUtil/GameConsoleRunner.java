package org.hulyam.gameConsoleXmlUtil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameConsoleRunner {
    public static void main(String[] args) {

        // to specify the XML configuration file:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("gameConsoleApplicationContext.xml");

        // instead of creating a new game object (new Mario, new Contra...)
        // we passed this to Spring via XMLApplicationContext
//        GameRunner gameRunner = new GameRunner(context.getBean("mygame", IRunnable.class));

        // Now, to also pass creating the new GameRunner object to Spring:
        GameRunner gameRunner = context.getBean("gamerunner", GameRunner.class);
        gameRunner.run();

        // Spring creates objects with respect to SINGLETON
        GameRunner gameRunner1 = context.getBean("gamerunner", GameRunner.class);
        gameRunner1.run();
    }
}
