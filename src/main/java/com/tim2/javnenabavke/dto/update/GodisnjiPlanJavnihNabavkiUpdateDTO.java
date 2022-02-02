package com.tim2.javnenabavke.dto.update;


import java.time.LocalDate;

@lombok.Data
public class GodisnjiPlanJavnihNabavkiUpdateDTO {
    private Long id;

    private Integer objavljen;

    private LocalDate godina;

    private Integer preduzeceId;

}
