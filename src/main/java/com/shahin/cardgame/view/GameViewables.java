package com.shahin.cardgame.view;

import com.shahin.cardgame.controller.GameController;

import java.util.ArrayList;
import java.util.List;

public class GameViewables implements GameViewable {
    List<GameViewable> views;

    public GameViewables() {
        views = new ArrayList<>();
    }

    public void addViewable(GameViewable view) {
        views.add(view);
    }

    @Override
    public void setController(GameController gameController) {
        for (GameViewable view : views) {
            view.setController(gameController);
        }
    }

    @Override
    public void promptForPlayerName() {
        for (GameViewable view : views) {
            view.promptForPlayerName();
        }
    }

    @Override
    public void promptForFlip() {
        for (GameViewable view : views) {
            view.promptForFlip();
        }
    }

    @Override
    public void promptForNewGame() {
        for (GameViewable view : views) {
            view.promptForNewGame();
        }
    }

    @Override
    public void showWinner(String winnerName) {
        for (GameViewable view : views) {
            view.showWinner(winnerName);
        }
    }

    @Override
    public void showPlayerName(int playerIndex, String playerName) {
        for (GameViewable view : views) {
            view.showPlayerName(playerIndex, playerName);
        }
    }

    @Override
    public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
        for (GameViewable view : views) {
            view.showFaceDownCardForPlayer(playerIndex, playerName);
        }
    }

    @Override
    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        for (GameViewable view : views) {
            view.showCardForPlayer(playerIndex, playerName, rank, suit);
        }
    }
}
