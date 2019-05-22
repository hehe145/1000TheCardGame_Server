package com.hehe145.cardgame.server.model;


import javax.persistence.*;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table( name = "Players")
public class Player {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Integer Id;

    @Column( name = "player_name")
    private String playerName;

    @Column( name = "password")
    private String password;

    @Column( name = "ranking_points")
    private int rankingPoints;

    @Transient
    private Game game;

    @ManyToMany(cascade = { CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH })
    @JoinTable(
            name = "player_role",
            joinColumns = { @JoinColumn(name = "player_id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id") }
    )
    Set<Role> roles = new HashSet<>();

    public Player() {
    }

    public Player(String playerName, String password) {
        this.playerName = playerName;
        this.password = password;
    }


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRankingPoints() {
        return rankingPoints;
    }

    public void setRankingPoints(int rankingPoints) {
        this.rankingPoints = rankingPoints;
    }
}
