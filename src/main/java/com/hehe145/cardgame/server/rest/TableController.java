package com.hehe145.cardgame.server.rest;

import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.model.Table;
import com.hehe145.cardgame.server.services.ServiceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/table")
public class TableController {

    private ServiceTable serviceTable;

    @Autowired
    public TableController(ServiceTable serviceTable) {
        this.serviceTable = serviceTable;
    }

    @GetMapping( "/test")
    public Message getTest() {
        return new Message("Test successfull", 200, Message.MessageType.SUCCESS);
    }


    @GetMapping( "/")
    public List<Table> getTables() {
        return serviceTable.getTables();
    }


    @PostMapping("/")
    public Message addTable(@RequestBody Table table) {
        return serviceTable.addTable( table.getTableName());
    }
}
