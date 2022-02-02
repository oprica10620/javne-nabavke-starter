package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class UgovorDTO {
    private Long id;

    private Integer idNarucioca;

    private Integer idPonudjaca;

    private Integer javnanabavkaId;

    private Integer okvirnisporazumId;

}
