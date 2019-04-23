package com.hehe145.cardgame.server.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/test")
    public String getTest() {
        return "Succes";
    }

    @GetMapping("/")
    public String login() {



        return "Succesful";
    }

    @PostMapping( "/register")
    public String register(@RequestBody String login, @RequestBody String password) {


        return "Registered";
    }


}
