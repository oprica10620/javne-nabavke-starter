package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@lombok.Data
public class PonudaDTO {
    private Long id;

    private Integer samostalnoIliGrupaPonudjaca;

    private String statusPonude;

    private String interniBroj;

    private LocalDate rokVazenjaPonude;

    private BigDecimal ukupnaCena;

    private BigDecimal ukupnaCenaSaPDV;

    private String valuta;

    private LocalDate rokPlacanja;

    private String nacinPlacanja;

    private Integer koristeSePodizvodjaci;

    private Integer ponudjacId;

    private Integer javnanabavkaId;

}
