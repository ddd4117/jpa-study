package com.example.demo.chapter6.otn;//package chap6.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy="team")
    private List<Member> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(Member member){
        this.members.add(member);
            member.setTeam(this);
    }
}
