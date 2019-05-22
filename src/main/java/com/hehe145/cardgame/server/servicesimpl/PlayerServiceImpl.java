package com.hehe145.cardgame.server.servicesimpl;

import com.google.common.hash.Hashing;
import com.hehe145.cardgame.server.model.Message;
import com.hehe145.cardgame.server.model.Player;
import com.hehe145.cardgame.server.repository.PlayerRepository;
import com.hehe145.cardgame.server.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Message register(String playerName, String password) {

        Player player = playerRepository.findAllByPlayerNameEquals( playerName);

        if ( player != null) {
            return new Message("Player with that login exist!", Message.MessageCode.PLAYER_EXIST);
        }

        String hashedPassword = getHashedPassword(password);

        playerRepository.save( new Player( playerName, hashedPassword));

        return new Message("Player " + playerName + "successfully registered!", Message.MessageCode.PLAYER_REGISTERED);
    }

    @Override
    public Message login(String playerName, String password) {

        Player player = playerRepository.findAllByPlayerNameEquals( playerName);

        String hashedPassword = getHashedPassword(password);

        if ( hashedPassword == player.getPassword()) {
            return new Message("Wrong login or password", Message.MessageCode.WRONG_LOGIN_OR_PASSWORD);
        }

        return new Message("Player " + playerName + " logged in!", Message.MessageCode.PLAYER_LOGIN);
    }

    @Override
    public Message logout(String playerName) {
        throw new UnsupportedOperationException("Not implemetted");
    }

    private String getHashedPassword(String password) {
        return Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
    }

}
