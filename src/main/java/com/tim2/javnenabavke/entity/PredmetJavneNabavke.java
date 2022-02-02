package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "predmetjavnenabavke")
public class PredmetJavneNabavke {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "naziv")
    private String naziv;
    
    @Column(name = "vrsta")
    private String vrsta;
    
    @Column(name = "kategorija")
    private String kategorija;

    @ManyToOne
    private StavkaJavneNabavke stavkaJavneNabavke;

}