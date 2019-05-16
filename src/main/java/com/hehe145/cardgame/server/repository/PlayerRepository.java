package com.hehe145.cardgame.server.repository;

import com.hehe145.cardgame.server.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findAllByPlayerNameEquals(String playerName);
}
