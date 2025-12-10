package com.lab1.lab2.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Character")
public class Character {
    private Long id;
    private String name;
    private String charClass;
    private int power;

    // Конструктор
    public Character() {}
    public Character(Long id, String name, String charClass, int power) {
        this.id = id;
        this.name = name;
        this.charClass = charClass;
        this.power = power;
    }

    // Геттери та сеттери
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCharClass() { return charClass; }
    public void setCharClass(String charClass) { this.charClass = charClass; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }
}
