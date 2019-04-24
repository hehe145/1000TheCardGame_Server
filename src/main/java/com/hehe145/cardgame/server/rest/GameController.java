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
        return new Message("Test successfull.", 280, Message.MessageType.SUCCESS);
    }

    @PostMapping("/join")
    public String joinToTable(@RequestBody PlayerBasic player, @RequestBody Table table, HttpServletRequest request) {

        gameService.joinToTable(player, table, request.getRemoteAddr());
        return "Joined";
    }

}
