package com.shahin.cardgame.view;

import com.shahin.cardgame.controller.GameController;

public interface GameViewable {
    void setController(GameController gameController);

    void promptForPlayerName();

    void promptForFlip();

    void promptForNewGame();

    void showWinner(String winnerName);

    void showPlayerName(int playerIndex, String name);

    void showFaceDownCardForPlayer(int playerIndex, String playerName);

    void showCardForPlayer(int playerIndex, String playerName, String rank, String suit);

}
