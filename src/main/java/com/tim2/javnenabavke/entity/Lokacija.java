package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table
public class Lokacija {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "adresaSedista")
    private String adresaSedista;
    
    @Column(name = "mesto")
    private String mesto;
    
    @Column(name = "postanskiBroj")
    private String postanskiBroj;
    
    @Column(name = "drzava")
    private String drzava;

}