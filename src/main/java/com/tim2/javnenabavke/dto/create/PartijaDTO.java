package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class PartijaDTO {
    private Long id;

    private String statusPartije;

    private String naziv;

    private String valuta;

    private String kriterijumiZaDodeluUgovoral;

    private String glavnoMestoIzvrsenja;

    private String NSTJIzvrsenja;

    private Integer trajanjeUgovoraUMesecima;

    private String dokumentiKojiSeZahtevaju;

    private Integer javnanabavkaId;

}
