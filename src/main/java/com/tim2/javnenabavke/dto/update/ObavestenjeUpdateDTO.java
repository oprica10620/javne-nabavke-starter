package com.tim2.javnenabavke.dto.update;


import java.time.LocalDate;

@lombok.Data
public class ObavestenjeUpdateDTO {
    private Long id;

    private String naziv;

    private LocalDate datumSlanja;

    private String tekst;

    private Integer javnanabavkaId;

}
