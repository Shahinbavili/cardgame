package com.shahin.cardgame.games;

import com.shahin.cardgame.model.IPlayer;

import java.util.List;

public interface GameEvaluator {
    public IPlayer evaluateWinner(List<IPlayer> players);
}


