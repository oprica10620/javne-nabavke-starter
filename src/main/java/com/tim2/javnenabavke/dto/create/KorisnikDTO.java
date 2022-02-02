package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class KorisnikDTO {
    private Long id;

    private String korisnickoIme;

    private String lozinka;

    private String ime;

    private String prezime;

    private String pol;

    private String email;

    private String telefon;

    private String faks;

    private String tip;

}
