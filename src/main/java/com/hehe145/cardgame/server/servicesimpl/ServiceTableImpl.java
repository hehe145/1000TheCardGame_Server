package com.hehe145.cardgame.server.servicesimpl;

import com.hehe145.cardgame.server.model.Table;
import com.hehe145.cardgame.server.services.GameService;
import com.hehe145.cardgame.server.services.ServiceTable;

import java.util.List;


public class ServiceTableImpl implements ServiceTable {

    private List<Table> tableList;
    private GameService gameService;

    @Override
    public List<Table> getTables() {

        return tableList;
    }

    @Override
    public Table addTable( String tableName) {
        Table table = new Table( tableName);

        tableList.add( table);
        gameService.addTable( tableName);

        return  table;
    }
}
