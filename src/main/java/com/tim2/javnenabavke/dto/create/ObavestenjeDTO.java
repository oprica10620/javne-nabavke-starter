package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;
import java.time.LocalDate;

@lombok.Data
public class ObavestenjeDTO {
    private Long id;

    private String naziv;

    private LocalDate datumSlanja;

    private String tekst;

    private Integer javnanabavkaId;

}
