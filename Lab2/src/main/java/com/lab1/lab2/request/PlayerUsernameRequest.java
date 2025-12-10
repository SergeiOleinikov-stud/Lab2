package com.lab1.lab2.request;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlayerUsernameRequest", namespace = "http://lab2/player")
public class PlayerUsernameRequest {
    private Long id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
