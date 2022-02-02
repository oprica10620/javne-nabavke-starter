package com.tim2.javnenabavke.dto.update;


import java.time.LocalDate;

@lombok.Data
public class ObjavaPlanaUpdateDTO {
    private Long id;

    private LocalDate datumObjave;

    private String statusObjave;

}
