package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table
public class PlanJavneNabavke {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "godinaPlana")
    private int godinaPlana;
    
    @Column(name = "statusPlana")
    private String statusPlana;
    
    @Column(name = "verzijaPlana")
    private int verzijaPlana;
    
    @Column(name = "datumUsvajanja")
    private Date datumUsvajanja;
    
    @Column(name = "datumSlanjaNaObjavu")
    private Date datumSlanjaNaObjavu;

    @ManyToOne
    private GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki;

    @ManyToOne
    private PredlogNabavke predlogNabavke;

    @ManyToOne
    private Narucilac narucilac;

    @ManyToOne
    private ObjavaPlana objavaPlana;

}