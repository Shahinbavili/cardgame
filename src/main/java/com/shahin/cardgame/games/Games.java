package com.shahin.cardgame.games;

import com.shahin.cardgame.controller.GameController;
import com.shahin.cardgame.model.Deck;
import com.shahin.cardgame.view.GameSwingView;

public class Games {
    public static void main(String[] args) {
//        GameController gc = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());

        GameController gc = new GameController(new Deck(), new GameSwingView(), new HighCardGameEvaluator());
        gc.run();
    }
}
