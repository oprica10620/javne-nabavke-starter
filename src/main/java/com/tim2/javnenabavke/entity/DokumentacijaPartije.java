package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class DokumentacijaPartije {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "doc1")
    private byte[] doc1;
    
    @Column(name = "doc2")
    private byte[] doc2;

    @ManyToOne
    private Partija partija;

}