package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "ponudjac")
public class Ponudjac {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "poreskiIdBroj")
    private int poreskiIdBroj;
    
    @Column(name = "maticniBroj")
    private int maticniBroj;
    
    @Column(name = "naziv")
    private String naziv;
    
    @Column(name = "internetStranica")
    private String internetStranica;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "telefon")
    private String telefon;
    
    @Column(name = "faks")
    private Integer faks;
    
    @Column(name = "osobaZaKontakt")
    private String osobaZaKontakt;
    
    @Column(name = "NSTJOznaka")
    private String nstjOznaka;
    
    @Column(name = "oblastInteresovanja")
    private String oblastInteresovanja;

    @OneToMany
    private Collection<OkvirniSporazum> okvirniSporazumi;

    @OneToMany
    private Collection<Ponuda> ponude;

    @ManyToOne
    private Lokacija lokacija;

    @ManyToOne
    private Korisnik korisnik;

    @OneToMany
    private Collection<Ugovor> ugovori;

    @OneToMany
    private Collection<Zalba> zalbe;

}