package com.hehe145.cardgame.server.services;

import com.hehe145.cardgame.server.model.Message;

/**
 * @author Robert Tarczyński
 *
 */

public interface PlayerService {
    Message register(String playerName, String password);

    Message login(String playerName, String password);
}
