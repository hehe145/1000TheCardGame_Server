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

    public Table() {
    }

    public String getTableName() {
    return tableName;
}

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<PlayerBasic> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<PlayerBasic> playerList) {
        this.playerList = playerList;
    }

    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }
}
