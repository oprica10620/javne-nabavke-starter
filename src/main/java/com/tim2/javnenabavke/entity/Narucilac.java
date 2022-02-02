package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table
public class Narucilac {
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
    private String faks;
    
    @Column(name = "osobaZaKontakt")
    private String osobaZaKontakt;
    
    @Column(name = "obavljaSektorskuDelatnost")
    private byte obavljaSektorskuDelatnost;
    
    @Column(name = "NSTJOznaka")
    private String nstjOznaka;

    @ManyToOne
    private Lokacija lokacija;

    @ManyToOne
    private VrstaJavnogNarucioca vrstaJavnogNarucioca;

    @ManyToOne
    private OsnovnaDelatnost osnovnaDelatnost;

    @ManyToOne
    private Korisnik korisnik;

}