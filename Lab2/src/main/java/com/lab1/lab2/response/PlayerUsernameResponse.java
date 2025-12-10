package com.lab1.lab2.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlayerUsernameResponse", namespace = "http://lab2/player")
public class PlayerUsernameResponse {
    private String username;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}
