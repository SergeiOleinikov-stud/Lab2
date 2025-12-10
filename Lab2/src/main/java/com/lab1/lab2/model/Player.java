package com.lab1.lab2.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Player")
public class Player {
    private Long id;
    private String username;
    private int level;

    // Конструктор
    public Player() {}
    public Player(Long id, String username, int level) {
        this.id = id;
        this.username = username;
        this.level = level;
    }

    // Геттери та сеттери
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
}
