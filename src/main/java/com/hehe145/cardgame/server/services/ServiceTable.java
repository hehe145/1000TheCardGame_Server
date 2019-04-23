package com.hehe145.cardgame.server.services;

import com.hehe145.cardgame.server.model.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceTable {

    List<Table> getTables();

    Table addTable(String tableName);
}
