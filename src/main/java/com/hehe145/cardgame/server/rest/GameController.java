package com.hehe145.cardgame.server.rest;

import com.hehe145.cardgame.server.model.PlayerBasic;
import com.hehe145.cardgame.server.model.Table;
import com.hehe145.cardgame.server.services.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/game")
public class GameController {

    private GameService gameService;

    @GetMapping("/test")
    public String getTest() {
        return "Succes";
    }

    @PostMapping("/join")
    public String joinToTable(@RequestBody PlayerBasic player, @RequestBody Table table) {

        gameService.joinToTable(player, table);
        return "Joined";
    }

}
