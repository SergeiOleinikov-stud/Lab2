package com.lab1.lab2.service;

import com.lab1.lab2.model.Character;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    public Character getCharacterById(Long id) {
        return new Character(id, "Mage" + id, "Support", 100);
    }

    public String getCharacterClass(Long id) {
        return getCharacterById(id).getCharClass();
    }

    public int getCharacterPower(Long id) {
        return getCharacterById(id).getPower();
    }
}
