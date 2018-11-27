package com.company;

// Task 3

public class BlackjackDealerHand extends BlackjackHand {
    private boolean isDealerTurn = false;
    public BlackjackDealerHand(int maxCards) {
        super(maxCards);
    }
    public void setDealerTurn(boolean dealerTurn) {
        isDealerTurn = dealerTurn;
    }
    // Overload toString
    public String toString() {
        if(!isDealerTurn) {
            return "XX  " + this.getCard(1).toString();
        }else {
            return super.toString();
        }
    }
}
