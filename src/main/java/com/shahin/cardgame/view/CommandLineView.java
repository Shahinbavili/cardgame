package com.shahin.cardgame.view;

import com.shahin.cardgame.controller.GameController;

import java.util.Scanner;

public class CommandLineView implements GameViewable{
    GameController controller;
    Scanner keyboard = new Scanner(System.in);


    public void setController(GameController gameController) {
        this.controller = gameController;
    }

    public void promptForPlayerName() {
        System.out.println("Enter Player Name: ");
        String name = keyboard.nextLine();
        if (name.isEmpty()) {
            controller.startGame();
        } else {
            controller.addPlayer(name);
        }
    }

    public void promptForFlip() {
        System.out.println("Press enter to reveal cards");
        keyboard.nextLine();
        controller.flipCards();
    }

    public void promptForNewGame() {
        System.out.println("Press enter to deal again or +q to exit");
        controller.nextAction(keyboard.nextLine());
    }

    public void showWinner(String winnerName) {
        System.out.println("Winner is " + winnerName + " !");
    }

    public void showPlayerName(int playerIndex, String name) {
        System.out.println("Player [" + playerIndex + "] is [" + name + "] !");
    }

    public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
        System.out.println("Player [" + playerIndex + "]  [" + playerName + "] [x][x]");
    }

    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        System.out.println("[" + playerIndex + "]  [" + playerName + "]  [" + rank + "]  [" + suit + "]");

    }

}
