package com.shahin.cardgame.games;

import com.shahin.cardgame.controller.GameController;
import com.shahin.cardgame.model.Deck;
import com.shahin.cardgame.view.GameSwingView;

public class Games {
    public static void main(String[] args) {
//        GameController gc = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());
        GameSwingView gsv = new GameSwingView();

        gsv.createAndShowGUI();

        GameController gc = new GameController(new Deck(), gsv, new HighCardGameEvaluator());
        gc.run();
    }
}
