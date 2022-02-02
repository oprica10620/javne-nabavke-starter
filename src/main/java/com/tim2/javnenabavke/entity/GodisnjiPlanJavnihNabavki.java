package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table
public class GodisnjiPlanJavnihNabavki {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "objavljen")
    private Byte objavljen;
    
    @Column(name = "godina")
    private Date godina;

    @ManyToOne
    private Preduzece preduzece;

}