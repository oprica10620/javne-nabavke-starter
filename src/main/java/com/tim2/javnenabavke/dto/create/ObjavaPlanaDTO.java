package com.tim2.javnenabavke.dto.create;


import java.time.LocalDate;

@lombok.Data
public class ObjavaPlanaDTO {
    private Long id;

    private LocalDate datumObjave;

    private String statusObjave;

}
