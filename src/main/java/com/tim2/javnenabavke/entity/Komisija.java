package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "komisija")
public class Komisija {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "glavni")
    private String glavni;

    @OneToMany
    private Collection<JavnaNabavka> javneNabavke;

    @OneToMany
    private Collection<KomisijaHasRadnik> komisije;

    @OneToMany
    private Collection<ObavestenjeOIzabranomPonudjacu> obavestenjaOIzabranomPonudjacu;

    @OneToMany
    private Collection<Zalba> zalbe;

}