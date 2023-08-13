package org.hulyam.gameConsoleIoC;

/*
 *  up --> "Go up."
 *  down --> "Go down."
 *  left --> "Go left."
 *  right --> "Go right."
 *
 */

public class Pacman implements IRunnable {
    @Override
    public void up() {
        System.out.println("Go up.");
    }

    @Override
    public void down() {
        System.out.println("Go down.");
    }

    @Override
    public void left() {
        System.out.println("Go left.");
    }

    @Override
    public void right() {
        System.out.println("Go right.");
    }
}
