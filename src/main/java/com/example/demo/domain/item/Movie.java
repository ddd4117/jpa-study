package com.example.demo.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Setter
@Getter
@Entity
@DiscriminatorValue("M")
public class Movie extends Item{
    private String director;
    private String actor;
}
