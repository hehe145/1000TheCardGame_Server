package com.hehe145.cardgame.server.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private ArrayDeque<Card> deck;

    public Deck() {

        deck = new ArrayDeque<>();

        List<Card> cards = new ArrayList<>();
        Card.Rank[] ranks = { Card.Rank.NINE, Card.Rank.TEN, Card.Rank.JACK, Card.Rank.QUEEN, Card.Rank.KING, Card.Rank.ACE};
        Card.Suite[] suites = { Card.Suite.CLUB, Card.Suite.SPADES, Card.Suite.DIAMOND, Card.Suite.HEART};

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 6; j ++)
            {
                cards.add( new Card( ranks[j], suites[i]));
            }
        }
        shuffleDeck( cards);

        deck.addAll( cards);
    }

    private void shuffleDeck(List<Card> cards) {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int c1 = random.nextInt( 24);
            int c2 = random.nextInt( 24);

            swamp( cards.get( c1), cards.get( c2));
        }
    }

    private void swamp(Card card1, Card card2) {

        Card temp = card1;
        card1 = card2;
        card2 = temp;
    }

    public Card nextCard() {
        return deck.poll();
    }
}
