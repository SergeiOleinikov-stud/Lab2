package com.lab1.lab2.service;

import com.lab1.lab2.model.Player;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    public Player getPlayerById(Long id) {
        return new Player(id, "Player1" + id, 3);
    }

    public String getPlayerUsername(Long id) {
        return getPlayerById(id).getUsername();
    }

    public int getPlayerLevel(Long id) {
        return getPlayerById(id).getLevel();
    }
}
