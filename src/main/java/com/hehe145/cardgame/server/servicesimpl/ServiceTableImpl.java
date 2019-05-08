package com.hehe145.cardgame.server.servicesimpl;

import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.model.Table;
import com.hehe145.cardgame.server.services.GameService;
import com.hehe145.cardgame.server.services.ServiceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceTableImpl implements ServiceTable {

    private List<Table> tableList;
    private GameService gameService;

    @Autowired
    public ServiceTableImpl(List<Table> tableList, GameService gameService) {
        this.tableList = tableList;
        this.gameService = gameService;
    }

    @Override
    public List<Table> getTables() {

        return tableList;
    }

    @Override
    public Message addTable(String tableName) {

        if ( isTableExist( tableName)) {
            return new Message("Table with that name exist", 110, Message.MessageType.ERROR);
        }

        tableList.add( new Table( tableName));
        gameService.addTable( tableName);

        return  new Message("New table successfully added", 210, Message.MessageType.SUCCESS);     //New table successfully added
    }

    private boolean isTableExist(String tableName) {

        return ! tableList.stream().filter( table -> table.getTableName().equals( tableName)).collect(Collectors.toList()).isEmpty();
    }

    @Bean
    private List<Table> tableList(){
        return new ArrayList<>();
    }
}
