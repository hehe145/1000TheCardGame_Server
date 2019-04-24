package com.hehe145.cardgame.server.rest;

import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Robert Tarczyński
 * Class responsible for login and registration requests
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    private PlayerService playerService;

    @Autowired
    public LoginController(PlayerService playerService) {
        this.playerService = playerService;
    }

    //-----------------------------------------------------------------

    @GetMapping("/test")
    public Message getTest() {
        return new Message("Test successfull.", 280, Message.MessageType.SUCCESS);
    }

    @GetMapping("/")
    public Message login( @RequestBody String playerName, @RequestBody String password) {

        return playerService.login( playerName, password);
    }

    @PostMapping( "/register")
    public Message register( @RequestBody String playerName, @RequestBody String password) {

        return playerService.register( playerName, password);
    }


}
