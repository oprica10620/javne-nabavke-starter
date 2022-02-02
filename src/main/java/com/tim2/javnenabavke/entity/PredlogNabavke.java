package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "predlognabavke")
public class PredlogNabavke {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "odobren")
    private byte odobren;

    @OneToMany
    private Collection<PlanJavneNabavke> planoviJavnihNabavki;

    @OneToMany
    private Collection<PredlogNabavkeHasRadnik> predlogNabavkeHasRadnik;

}