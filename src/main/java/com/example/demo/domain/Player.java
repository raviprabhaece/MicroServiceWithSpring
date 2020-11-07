package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Player {

    @javax.persistence.Id
    @Id @GeneratedValue
    Long id;
    String name;
    String position;

    public Player() {
    super();
    }
    public Player(String name, String position) {
        this();
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
