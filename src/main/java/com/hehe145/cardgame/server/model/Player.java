package com.hehe145.cardgame.server.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Table;


@Entity
@Table( name = "Players")
public class Player {

    @Id
    private Integer ID;

    @Column( name = "player_name")
    private String playerName;

    @Column( name = "password")
    private String password;

    @Column( name = "ranking_points")
    private int rankingPoints;

    @Transient
    private Game game;

    public Player() {
    }

    public Player(String playerName, String password) {
        this.playerName = playerName;
        this.password = password;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRankingPoints() {
        return rankingPoints;
    }

    public void setRankingPoints(int rankingPoints) {
        this.rankingPoints = rankingPoints;
    }
}
