package com.shahin.cardgame.model;

public class PlayingCardAdapter implements PlayableCard {
    CoolCard coolCard;

    public void flip() {
        coolCard.turnOver();
    }
}
