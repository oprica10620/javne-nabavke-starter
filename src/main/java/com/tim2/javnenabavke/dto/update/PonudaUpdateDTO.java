package com.tim2.javnenabavke.dto.update;


import java.math.BigDecimal;
import java.time.LocalDate;

@lombok.Data
public class PonudaUpdateDTO {
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
