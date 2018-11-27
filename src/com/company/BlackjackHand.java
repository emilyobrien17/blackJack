package com.company;

// Task 2

public class BlackjackHand extends Hand {
    public BlackjackHand(int maxCards) {
        super(maxCards);
    }
    public int getValue() {
        int value = 0;
        for (int i = 0; i < getNumCards(); i++) {
            Card x = getCard(i);
            if(x.isAce())
            {
                if(value > 10) {
                    value += 1;
                }
                else {
                    value += 11;
                }
            }
            else if(x.isFaceCard()){
                value += 10;
            }
            else {
                value += x.getDefaultValue();
            }
        }
        return value;
    }
}