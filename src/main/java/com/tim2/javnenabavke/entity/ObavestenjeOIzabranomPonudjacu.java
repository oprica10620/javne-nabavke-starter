package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "obavestenjeoizabranomponudjacu")
public class ObavestenjeOIzabranomPonudjacu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Komisija komisija;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

    @OneToMany
    private Collection<Zalba> zalbe;

}