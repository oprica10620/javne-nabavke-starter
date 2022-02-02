package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table
public class OkvirniSporazum {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

    @ManyToOne
    private Narucilac narucilac;

    @ManyToOne
    private Ponudjac ponudjac;

}