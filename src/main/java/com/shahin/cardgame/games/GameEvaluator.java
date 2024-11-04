package com.shahin.cardgame.games;

import com.shahin.cardgame.model.Player;
import com.shahin.cardgame.model.PlayingCard;

import java.util.List;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);
}


