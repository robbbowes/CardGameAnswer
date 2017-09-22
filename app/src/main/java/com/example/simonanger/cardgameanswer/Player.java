package com.example.simonanger.cardgameanswer;

/**
 * Created by simonanger on 07/09/2017.
 */

public class Player {
    private String name;
    private int points;
    private Card card;

    public Player(String name){
        this.name = name;
        this.points = 0;
        this.card = null;

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void incrementPoints() {
        this.points++;
    }
}
