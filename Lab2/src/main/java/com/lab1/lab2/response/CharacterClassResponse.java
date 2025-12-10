package com.lab1.lab2.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CharacterClassResponse", namespace = "http://lab2/character")
public class CharacterClassResponse {
    private String charClass;

    public String getCharClass() { return charClass; }
    public void setCharClass(String charClass) { this.charClass = charClass; }
}
