package org.hulyam.gameConsoleAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    IRunnable game;

    // Constructor Injection
/*    public GameRunner(IRunnable game) {
        this.game = game;
    }*/

    public void run() {
        System.out.println("Game is running ==> " + game.getClass().getSimpleName() + " - " + game.hashCode());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
