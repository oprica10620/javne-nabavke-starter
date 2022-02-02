package com.tim2.javnenabavke.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "statusjavnenabavke")
public class StatusJavneNabavke {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "naziv")
    private String naziv;

    @OneToMany
    private Collection<JavnaNabavka> javneNabavke;

}