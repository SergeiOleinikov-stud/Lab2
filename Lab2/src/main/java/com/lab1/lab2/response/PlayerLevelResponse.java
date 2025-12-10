package com.lab1.lab2.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlayerLevelResponse", namespace = "http://lab2/player")
public class PlayerLevelResponse {
    private int level;

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
}
