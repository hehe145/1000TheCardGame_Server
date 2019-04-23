package com.hehe145.cardgame.server.model;

import java.util.List;

public class GameTable {

    private String tableName;
    private List<Player> playerList;
    private Deck deck;
    private List<Card> biddingCards;
    private int round;
    private int tour;

    public GameTable(String tableName) {
    }
}
