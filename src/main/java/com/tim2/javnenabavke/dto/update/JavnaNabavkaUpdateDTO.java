package com.tim2.javnenabavke.dto.update;


import java.math.BigDecimal;
import java.time.LocalDate;

@lombok.Data
public class JavnaNabavkaUpdateDTO {
    private Long id;

    private Integer nijePredvidjenaUPlanu;

    private String naziv;

    private String interniBroj;

    private BigDecimal procenjenaVrednost;

    private Integer objavaProcenjeneVrednosti;

    private Integer zahtevZaElekKomunikaciju;

    private String kratakOpis;

    private LocalDate rokZaPodnosenjePonuda;

    private Integer rokVazenjaPonudeUDanima;

    private LocalDate datumOtvaranjaPonuda;

    private String opis;

    private Integer jelMala;

    private Integer komisijaId;

    private Integer komisijaOdobrila;

    private Integer statusjavnenabavkeId;

    private Integer vrstapostupkaId;

    private Integer vrstapredmetaId;

    private Integer narucilacId;

}
