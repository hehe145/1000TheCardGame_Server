package com.hehe145.cardgame.server.model;

import javax.persistence.Transient;

public class Game {

    @Transient
    private Table table;

    @Transient
    private String clientAddress;

}
