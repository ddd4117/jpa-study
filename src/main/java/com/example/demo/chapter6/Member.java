package com.example.demo.chapter6;//package chap6.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Member(String name) {
        this.name = name;
    }

    public void setTeam(Team team) {
        this.team = team;
        if(team.getMember() != this) {
            team.setMember(this);
        }
    }
}
