package org.hulyam.gameConsoleQualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mario")
public class Mario implements IRunnable {

    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Enter the tube.");
    }

    public void left() {
        System.out.println("Go back.");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
