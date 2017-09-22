package com.example.simonanger.cardgameanswer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by simonanger on 08/09/2017.
 */

public class RandomDealer implements Dealer {
    ArrayList<Card> deck;
    Random random;

    public RandomDealer(ArrayList<Card> deck){
        this.deck = deck;
        this.random = new Random();
    }

    public Card deal(){
        int randomIndex = this.random.nextInt(this.deck.size());
        // rand.nextInt(52) => 0...51

        Card randomCard = this.deck.remove(randomIndex);
        return randomCard;
    }

}
