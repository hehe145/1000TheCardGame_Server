package com.hehe145.cardgame.server.services;

import com.hehe145.cardgame.server.model.PlayerBasic;
import com.hehe145.cardgame.server.model.Table;
import org.springframework.stereotype.Service;

public interface GameService {
    void addTable(String tableName);

    void joinToTable(PlayerBasic player, Table table, String remoteAddr);
}
