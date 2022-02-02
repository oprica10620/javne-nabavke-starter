package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "obavestenje")
public class Obavestenje {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "naziv")
    private String naziv;
    
    @Column(name = "datumSlanja")
    private Date datumSlanja;
    
    @Column(name = "tekst")
    private String tekst;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

}