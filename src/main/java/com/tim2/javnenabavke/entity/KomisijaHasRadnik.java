package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "komisija_has_radnik")
public class KomisijaHasRadnik {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Radnik radnik;

    @ManyToOne
    private Komisija komisija;

}