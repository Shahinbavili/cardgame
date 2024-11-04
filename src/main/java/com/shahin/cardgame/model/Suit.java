package com.shahin.cardgame.model;

public enum Suit {
    NONE(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3),
    CLUBS(4);

    private final int suit;

    Suit(int value) {
        this.suit = value;
    }

    public int value() {
        return suit;
    }
}
