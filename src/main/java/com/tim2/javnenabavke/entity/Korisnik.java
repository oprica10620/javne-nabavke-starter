package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "korisnik")
public class Korisnik {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "korisnickoIme")
    private String korisnickoIme;
    
    @Column(name = "lozinka")
    private String lozinka;
    
    @Column(name = "ime")
    private String ime;
    
    @Column(name = "prezime")
    private String prezime;
    
    @Column(name = "pol")
    private String pol;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "telefon")
    private String telefon;
    
    @Column(name = "faks")
    private String faks;
    
    @Column(name = "tip")
    private String tip;

    @OneToMany
    private Collection<Narucilac> narucila;

    @OneToMany
    private Collection<Ponudjac> ponudjaci;

    @OneToMany
    private Collection<Radnik> radnici;

}