package com.tim2.javnenabavke.dto.create;


import java.io.Serializable;

@lombok.Data
public class RadnikDTO {
    private Long id;

    private String ulogaUPreduzecu;

    private Integer odgovornoLice;

    private Integer kreiranOdStrane;

    private Integer korisnikId;

    private Integer preduzeceId;

}
