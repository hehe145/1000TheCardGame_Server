package com.hehe145.cardgame.server.services;

import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.model.Table;

import java.util.List;


public interface TableService {

    List<Table> getTables();

    Message addTable(String tableName);
}
