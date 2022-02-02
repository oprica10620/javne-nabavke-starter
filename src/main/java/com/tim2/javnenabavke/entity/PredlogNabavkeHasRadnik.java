package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class PredlogNabavkeHasRadnik {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @ManyToOne
    private Radnik radnik;

    @ManyToOne
    private PredlogNabavke predlogNabavke;

}