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
@RequestMapping("/account")
public class LoginController {

    private PlayerService playerService;

    @Autowired
    public LoginController( PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping("/test")
    public Message getTest() {
        return new Message("Test successfull.", Message.MessageCode.TEST_SUCCESSFUL);
    }


    @RequestMapping( value = "/login", method = RequestMethod.POST)
    public Message login( @ModelAttribute("playerName") String playerName, @ModelAttribute("password") String password) {
        if (true)
            return new Message( playerName + " " + password, Message.MessageCode.PLAYER_EXIST);
        return playerService.login( playerName, password);
    }


    @RequestMapping( value = "/register", method = RequestMethod.POST)
    public Message register( @ModelAttribute("playerName") String playerName, @ModelAttribute("password") String password) {

        return playerService.register( playerName, password);
    }

    @RequestMapping( value = "/logout", method = RequestMethod.POST)
    public Message logout( @ModelAttribute("playerName") String playerName) {
        return playerService.logout( playerName);
    }

}
