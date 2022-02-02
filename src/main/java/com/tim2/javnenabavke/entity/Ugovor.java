package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ugovor")
public class Ugovor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Narucilac narucilac;

    @ManyToOne
    private Ponudjac ponudjac;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

    @ManyToOne
    private OkvirniSporazum okvirniSporazum;

}