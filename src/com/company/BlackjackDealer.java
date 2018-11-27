package com.company;

// Task 4

public class BlackjackDealer extends Player {
    public boolean wantsHit(Hand ownHand, Hand opponentHand){
        // Opponent went over 21
        if(opponentHand.getValue() > 21){
            return false;
        }
        // Dealer has 21
        if(ownHand.getValue() == 21){
            return false;
        }
        // Opponent has BlackJack
        if(opponentHand.getValue() == 21 && opponentHand.getNumCards() == 2){
            return false;
        }
        // Dealer has less than 17
        if(ownHand.getValue() < 17){
            return true;
        }
        // Opponent has less than 21
        if(opponentHand.getValue() < 21){
            return true;
        }
        // opponent has 21, but not BlackJack
        if(opponentHand.getValue() == 21){
            return true;
        }
        // Catch all
        else {
            return false;
        }
    }
}
