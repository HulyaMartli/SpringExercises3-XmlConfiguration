package org.hulyam.gameConsoleOop;

public class GameRunner {
    IRunnable game;

    public GameRunner(IRunnable game){
        this.game=game;
    }
    public void run(){
//        IGame game = new Mario();
//        IGame game = new Pacman();
        System.out.println("Game is running ==> "+game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
