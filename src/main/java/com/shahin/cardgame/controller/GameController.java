package com.shahin.cardgame.controller;

import com.shahin.cardgame.games.GameEvaluator;
import com.shahin.cardgame.model.Deck;
import com.shahin.cardgame.model.Player;
import com.shahin.cardgame.model.PlayingCard;
import com.shahin.cardgame.view.CommandLineView;

import java.util.ArrayList;
import java.util.List;

public class GameController {


    enum GameState {
        AddingPlayers, CardsDealt, WinnerRevealed;
    }

    Deck deck;
    List<Player> players;
    Player winner;
    CommandLineView view;
    GameState gameState;
    GameEvaluator evaluator;

    public GameController(Deck deck, CommandLineView view, GameEvaluator gameEvaluator) {
        super();
        this.deck = deck;
        this.view = view;
        this.players = new ArrayList<Player>();
        this.gameState = GameState.AddingPlayers;
        this.evaluator = gameEvaluator;
        view.setController(this);

    }

    public void run() {
        while (gameState == GameState.AddingPlayers) {
            view.promptForPlayerName();
        }

        switch (gameState) {
            case CardsDealt -> view.promptForFlip();
            case WinnerRevealed -> view.promptForNewGame();
        }
    }

    public void addPlayer(String playerName) {
        if (gameState == GameState.AddingPlayers) {
            players.add(new Player(playerName));
            view.showPlayerName(players.size(), playerName);
        }
    }

    public void startGame() {
        if (gameState != GameState.CardsDealt) {
            deck.shuffle();
            int playerIndex = 1;
            for (Player player : players) {
                player.addCardToHand(deck.removeTopCard());
                view.showFaceDownCardForPlayer(playerIndex++, player.getName());
            }
            gameState = GameState.CardsDealt;
        }

        this.run();
    }

    public void flipCards() {
        int playerIndex = 1;
        for (Player player : players) {
            PlayingCard pc = player.getCard(0);
            pc.flip();
            view.showCardForPlayer(playerIndex++, player.getName(),
                    pc.getRank().toString(), pc.getSuit().toString());
        }
        evaluateWinner();
        displayWinner();
        rebuildDeck();
        gameState = GameState.WinnerRevealed;
        this.run();
    }

    void evaluateWinner() {
        winner = evaluator.evaluateWinner(players);
    }

    void displayWinner() {
        view.showWinner(winner.getName());
    }

    void rebuildDeck() {
        for (Player player : players) {
            deck.returnCardToDeck(player.removeCard());
        }
    }

    void exitGame() {
        System.exit(0);
    }

    public void nextAction(String nextChoice) {
        if ("+q".equals(nextChoice)) {
            exitGame();
        } else {
            startGame();
        }
    }
}
