package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table
public class JavnaNabavka {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nijePredvidjenaUPlanu")
    private Byte nijePredvidjenaUPlanu;
    
    @Column(name = "naziv")
    private String naziv;
    
    @Column(name = "interniBroj")
    private String interniBroj;
    
    @Column(name = "procenjenaVrednost")
    private int procenjenaVrednost;
    
    @Column(name = "objavaProcenjeneVrednosti")
    private Byte objavaProcenjeneVrednosti;
    
    @Column(name = "zahtevZaElekKomunikaciju")
    private Byte zahtevZaElekKomunikaciju;
    
    @Column(name = "kratakOpis")
    private String kratakOpis;
    
    @Column(name = "rokZaPodnosenjePonuda")
    private Date rokZaPodnosenjePonuda;
    
    @Column(name = "rokVazenjaPonudeUDanima")
    private int rokVazenjaPonudeUDanima;
    
    @Column(name = "datumOtvaranjaPonuda")
    private Date datumOtvaranjaPonuda;
    
    @Column(name = "opis")
    private String opis;
    
    @Column(name = "jelMala")
    private byte jelMala;
    
    @Column(name = "komisijaOdobrila")
    private byte komisijaOdobrila;

    @ManyToOne
    private Komisija komisija;

    @ManyToOne
    private StatusJavneNabavke statusJavneNabavke;

    @ManyToOne
    private VrstaPostupka vrstaPostupka;

    @ManyToOne
    private VrstaPredmeta vrstaPredmeta;

    @ManyToOne
    private Narucilac narucilac;

    
}