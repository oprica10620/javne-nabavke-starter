package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "partija")
public class Partija {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "statusPartije")
    private String statusPartije;
    
    @Column(name = "naziv")
    private String naziv;
    
    @Column(name = "valuta")
    private String valuta;
    
    @Column(name = "kriterijumiZaDodeluUgovoral")
    private String kriterijumiZaDodeluUgovoral;
    
    @Column(name = "glavnoMestoIzvrsenja")
    private String glavnoMestoIzvrsenja;
    
    @Column(name = "NSTJIzvrsenja")
    private String nstjIzvrsenja;
    
    @Column(name = "trajanjeUgovoraUMesecima")
    private int trajanjeUgovoraUMesecima;
    
    @Column(name = "dokumentiKojiSeZahtevaju")
    private String dokumentiKojiSeZahtevaju;

    @OneToMany
    private Collection<DokumentacijaPartije> dokumentacijaPartija;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

}