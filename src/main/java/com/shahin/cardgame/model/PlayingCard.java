package com.shahin.cardgame.model;

public class PlayingCard implements PlayableCard {
    private Rank rank;
    private Suit suit;
    private boolean faceUp;


    public PlayingCard(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return faceUp;
    }


    public void flip() {
        faceUp = !faceUp;
    }
}
