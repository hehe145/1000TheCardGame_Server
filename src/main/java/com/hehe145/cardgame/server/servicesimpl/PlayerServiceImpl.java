package com.hehe145.cardgame.server.servicesimpl;

import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.services.PlayerService;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Override
    public Message register(String playerName, String password) {
        return null;
    }

    @Override
    public Message login(String playerName, String password) {
        return null;
    }
}
