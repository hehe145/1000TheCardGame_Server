package com.hehe145.cardgame.server.servicesimpl;

import com.hehe145.cardgame.server.model.GameTable;
import com.hehe145.cardgame.server.model.PlayerBasic;
import com.hehe145.cardgame.server.model.Table;
import com.hehe145.cardgame.server.services.GameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private List<GameTable> gameTableList;

    @Override
    public void addTable(String tableName) {

        GameTable gameTable = new GameTable( tableName);
        gameTableList.add( gameTable);
    }



    @Override
    public void joinToTable(PlayerBasic player, Table table, String remoteAddr) {

    }

}
