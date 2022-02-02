package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class PonudjacDTO {
    private Long id;

    private Integer poreskiIdBroj;

    private Integer maticniBroj;

    private String naziv;

    private String internetStranica;

    private String email;

    private String telefon;

    private Integer faks;

    private String osobaZaKontakt;

    private String NSTJOznaka;

    private String oblastInteresovanja;

    private Integer lokacijaId;

    private Integer korisnikId;

}
