package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class NarucilacDTO {
    private Long id;

    private Integer poreskiIdBroj;

    private Integer maticniBroj;

    private String naziv;

    private String internetStranica;

    private String email;

    private String telefon;

    private String faks;

    private String osobaZaKontakt;

    private Integer obavljaSektorskuDelatnost;

    private String NSTJOznaka;

    private Integer lokacijaId;

    private Integer vrstajavnognaruciocaId;

    private Integer osnovnadelatnostId;

    private Integer korisnikId;

}
