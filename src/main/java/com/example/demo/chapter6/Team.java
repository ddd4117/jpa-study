package com.example.demo.chapter6;//package chap6.entity;

import javax.persistence.*;

import com.example.demo.chapter6.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy="team")
    private Member member;

    public Team(String name) {
        this.name = name;
    }

    public void setMember(Member member){
        this.member = member;
        if(member.getTeam() != this) {
            member.setTeam(this);
        }
    }
}
