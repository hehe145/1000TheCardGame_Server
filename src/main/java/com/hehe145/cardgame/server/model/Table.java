package com.hehe145.cardgame.server.model;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private String tableName;
    private List<PlayerBasic> playerList;
    private boolean gameStarted;

    public Table(String tableName) {
        this.tableName = tableName;
        this.playerList = new ArrayList<>();
        this.gameStarted = false;
    }
}
