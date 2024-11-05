package com.shahin.cardgame.factory;

import com.shahin.cardgame.model.Deck;
import com.shahin.cardgame.model.NormalDeck;
import com.shahin.cardgame.model.SmallDeck;
import com.shahin.cardgame.model.TestDeck;

public class DeckFactory {
    public enum DeckType{
        Normal,
        Small,
        Test
    };
    public static Deck createDeck(DeckType deckType){
        switch (deckType){
            case Normal -> new NormalDeck();
            case Small -> new SmallDeck();
            case Test -> new TestDeck();
        }
        return new NormalDeck();
    }
}
