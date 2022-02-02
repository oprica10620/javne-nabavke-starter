package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "ponuda")
public class Ponuda {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "samostalnoIliGrupaPonudjaca")
    private byte samostalnoIliGrupaPonudjaca;
    
    @Column(name = "statusPonude")
    private String statusPonude;
    
    @Column(name = "interniBroj")
    private String interniBroj;
    
    @Column(name = "rokVazenjaPonude")
    private Date rokVazenjaPonude;
    
    @Column(name = "ukupnaCena")
    private int ukupnaCena;
    
    @Column(name = "ukupnaCenaSaPDV")
    private int ukupnaCenaSaPdv;
    
    @Column(name = "valuta")
    private String valuta;
    
    @Column(name = "rokPlacanja")
    private Date rokPlacanja;
    
    @Column(name = "nacinPlacanja")
    private String nacinPlacanja;
    
    @Column(name = "koristeSePodizvodjaci")
    private Byte koristeSePodizvodjaci;

    @ManyToOne
    private Ponudjac ponudjac;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

}