package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "preduzece")
public class Preduzece {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nazivPreduzeca")
    private String nazivPreduzeca;

    @OneToMany
    private Collection<GodisnjiPlanJavnihNabavki> godisnjiPlanoviJavnihNabavki;

    @ManyToOne
    private Narucilac narucilac;

    @OneToMany
    private Collection<Radnik> radnici;

}