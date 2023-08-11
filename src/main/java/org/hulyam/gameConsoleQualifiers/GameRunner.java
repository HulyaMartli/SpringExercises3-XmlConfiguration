package org.hulyam.gameConsoleQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    @Qualifier("contra")
    IRunnable game;

    // Constructor Injection
    /*public GameRunner(@Qualifier("contra") IRunnable game) {
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
