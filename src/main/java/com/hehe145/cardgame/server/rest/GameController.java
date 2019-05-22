package com.hehe145.cardgame.server.rest;

import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.model.PlayerBasic;
import com.hehe145.cardgame.server.model.Table;
import com.hehe145.cardgame.server.services.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/game")
public class GameController {

    private GameService gameService;

    @GetMapping("/test")
    public Message getTest() {
        return new Message("Test successfull.", Message.MessageCode.TEST_SUCCESSFUL);
    }

    @PostMapping("/join")
    public Message joinToTable( @RequestBody PlayerBasic player, @RequestBody Table table, HttpServletRequest request) {
        if (true)
            return new Message(player.getPlayerName() + " " + table.getTableName(), Message.MessageCode.PLAYER_EXIST);
        gameService.joinToTable(player, table, request.getRemoteAddr());
        return new Message("Joined to table '" + table.getTableName() + "'", Message.MessageCode.JOINED_TO_TABLE);
    }


//    @PostMapping("/{tableName}/bid")
//    public Message bid(  )
}
