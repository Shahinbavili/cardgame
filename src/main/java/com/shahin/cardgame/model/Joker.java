package com.shahin.cardgame.model;

public class Joker extends PlayingCard {

    public Joker(Rank rank, Suit suit) {
        super(rank, suit);
    }

    public Rank getRank() {
        throw new UnsupportedOperationException();
    }

    public Suit getSuit() {
        throw new UnsupportedOperationException();
    }
};
