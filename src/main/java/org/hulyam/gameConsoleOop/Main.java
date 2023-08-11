package org.hulyam.gameConsoleOop;

/*
 * Using OOP principles,
 *
 * 1. Create a class named Mario that has 4 methods:
 *      - up() --> Jump
 *      - down() --> Enter the tube
 *      - left() --> Go back
 *      - right() --> Accelerate
 *
 * 2. Create a class named GameRunner that has a run() method
 * which runs the 4 methods in Mario class
 *
 * 3. Add 2 new games: Pacman and Contra thinking this is a console game
 * and user chooses from different games in the Main class
 *
 */

public class Main {
    public static void main(String[] args) {

        GameRunner gameRunner = new GameRunner(new Mario()); // new Mario or Pacman or Contra object is created
        // We want to transfer the process of
        // creating new objects to Spring Framework
        gameRunner.run();
    }
}
