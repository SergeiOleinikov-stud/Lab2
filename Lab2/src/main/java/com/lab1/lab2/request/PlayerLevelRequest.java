package com.lab1.lab2.request;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlayerLevelRequest", namespace = "http://lab2/player")
public class PlayerLevelRequest {
    private Long id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
