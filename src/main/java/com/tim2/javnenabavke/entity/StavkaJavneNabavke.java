package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table
public class StavkaJavneNabavke {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "procenjenaVrednost")
    private int procenjenaVrednost;
    
    @Column(name = "objavaProcenjeneVrednosti")
    private Byte objavaProcenjeneVrednosti;
    
    @Column(name = "okvirnoVreme")
    private int okvirnoVreme;
    
    @Column(name = "kratakOpis")
    private String kratakOpis;
    
    @Column(name = "CPVOznaka")
    private String cpvOznaka;
    
    @Column(name = "NSTJIzvrsenja")
    private String nstjIzvrsenja;
    
    @Column(name = "komentar")
    private String komentar;

    @ManyToOne
    private JavnaNabavka javnaNabavka;

    @ManyToOne
    private PlanJavneNabavke planJavneNabavke;

}