package org.hulyam.gameConsoleIoCAnnotation;

/*
 *  up --> "Go up."
 *  down --> "Duck!"
 *  left --> "Go back."
 *  right --> "Fire!"
 *
 */

import org.springframework.stereotype.Component;

@Component
public class Contra implements IRunnable {
    @Override
    public void up() {
        System.out.println("Go up.");
    }

    @Override
    public void down() {
        System.out.println("Duck!");
    }

    @Override
    public void left() {
        System.out.println("Go back.");
    }

    @Override
    public void right() {
        System.out.println("Fire!");
    }
}
