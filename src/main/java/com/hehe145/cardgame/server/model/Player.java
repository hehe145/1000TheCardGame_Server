package com.hehe145.cardgame.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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




}
