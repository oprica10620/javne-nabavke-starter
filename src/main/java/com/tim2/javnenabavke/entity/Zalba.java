package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Zalba {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Ponudjac ponudjac;

    @ManyToOne
    private Komisija komisija;

    @ManyToOne
    private ObavestenjeOIzabranomPonudjacu obavestenjeOIzabranomPonudjacu;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

}