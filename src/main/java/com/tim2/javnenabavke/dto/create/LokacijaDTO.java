package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class LokacijaDTO {
    private Long id;

    private String adresaSedista;

    private String mesto;

    private String postanskiBroj;

    private String drzava;

}
