package com.lab1.lab2.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CharacterPowerResponse", namespace = "http://lab2/character")
public class CharacterPowerResponse {
    private int power;

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }
}
