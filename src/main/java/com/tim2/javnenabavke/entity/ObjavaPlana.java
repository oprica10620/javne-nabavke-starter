package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table(name = "objavaplana")
public class ObjavaPlana {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "datumObjave")
    private Date datumObjave;
    
    @Column(name = "statusObjave")
    private String statusObjave;

    @OneToMany
    private Collection<PlanJavneNabavke> planoviJavnihNabavki;

}