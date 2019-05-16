package com.hehe145.cardgame.server.model;

import java.util.List;

public class GameTable {

    public enum GameState {
        WAITING_FOR_PLAYERS, GAME_STARTED, BIDDING, GAME, GAME_OVER
    }

    private String tableName;
    private GameState gameState = GameState.WAITING_FOR_PLAYERS;
    private List<Player> playerList;
    private Deck deck;
    private List<Card> biddingCards;
    private List<Card> cardsOnTable;

    private int roundNumber;
    private int tourNumber;
    private int stake;
    private int cardTrowed;

    private int foldedPlayers = 0;
    private Card.Suite trumpSuite = Card.Suite.NONE;

    public GameTable(String tableName) {

    }



}
