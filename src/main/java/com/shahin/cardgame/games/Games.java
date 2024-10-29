package com.shahin.cardgame.games;

import com.shahin.cardgame.controller.GameController;
import com.shahin.cardgame.model.Deck;
import com.shahin.cardgame.view.View;

public class Games {
    public static void main(String[] args) {
        GameController gc = new GameController(new Deck(), new View());
        gc.run();
    }
}
