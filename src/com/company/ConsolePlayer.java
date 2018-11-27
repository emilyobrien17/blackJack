package com.company;
import java.util.Scanner;

// Task 4

public class ConsolePlayer extends Player {
    private Scanner scanner;
    public ConsolePlayer(Scanner scanner) {
        this.scanner = scanner;
    }
    public boolean wantsHit(Hand ownHand, Hand opponentHand){
        System.out.print("Do you want another hit? ");
        if("y".equals(this.scanner.next())) {
            return true;
        }
        else {
            return false;
        }

    }
}
