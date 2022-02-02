package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table
public class Radnik {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "ulogaUPreduzecu")
    private String ulogaUPreduzecu;
    
    @Column(name = "odgovornoLice")
    private byte odgovornoLice;
    
    @Column(name = "kreiranOdStrane")
    private Integer kreiranOdStrane;

    @ManyToOne
    private Korisnik korisnik;

    @ManyToOne
    private Preduzece preduzece;

}