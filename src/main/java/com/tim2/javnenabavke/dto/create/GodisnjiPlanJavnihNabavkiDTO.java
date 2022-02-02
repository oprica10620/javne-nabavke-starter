package com.tim2.javnenabavke.dto.create;


import java.time.LocalDate;

@lombok.Data
public class GodisnjiPlanJavnihNabavkiDTO {
    private Long id;

    private Integer objavljen;

    private LocalDate godina;

    private Integer preduzeceId;

}
