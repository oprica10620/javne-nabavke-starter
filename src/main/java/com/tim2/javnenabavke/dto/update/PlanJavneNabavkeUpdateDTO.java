package com.tim2.javnenabavke.dto.update;


import java.time.LocalDate;

@lombok.Data
public class PlanJavneNabavkeUpdateDTO {
    private Long id;

    private Integer godinaPlana;

    private String statusPlana;

    private Integer verzijaPlana;

    private LocalDate datumUsvajanja;

    private LocalDate datumSlanjaNaObjavu;

    private Integer godisnjiplanjavnihnabavkiId;

    private Integer predlognabavkeId;

    private Integer narucilacId;

    private Integer objavaplanaId;

}
