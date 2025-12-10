package com.lab1.lab2.request;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CharacterClassRequest", namespace = "http://lab2/character")
public class CharacterClassRequest {
    private Long id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
