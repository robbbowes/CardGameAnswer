package com.example.simonanger.cardgameanswer;

/**
 * Created by simonanger on 07/09/2017.
 */

public class Card {
    private int value;
    private Suit suit;


    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
}
