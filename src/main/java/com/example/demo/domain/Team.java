package com.example.demo.domain;

import org.hibernate.engine.internal.Cascade;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
@Entity
public class Team {
    @javax.persistence.Id
    @Id @GeneratedValue
    Long id;

    String name;
    String location;
    String mascotte;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> playerSet;

    public Team() {
        super();
    }
    public Team(String location, String name, Set<Player> players) {
        this();
        this.location = location;
        this.name = name;
        this.playerSet = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayerSet() {
        return playerSet;
    }

    public void setPlayerSet(Set<Player> playerSet) {
        this.playerSet = playerSet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
