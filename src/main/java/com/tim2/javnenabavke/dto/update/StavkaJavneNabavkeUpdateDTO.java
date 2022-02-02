package com.tim2.javnenabavke.dto.update;


import java.math.BigDecimal;

@lombok.Data
public class StavkaJavneNabavkeUpdateDTO {
    private Long id;

    private BigDecimal procenjenaVrednost;

    private Integer objavaProcenjeneVrednosti;

    private Integer okvirnoVreme;

    private String kratakOpis;

    private String CPVOznaka;

    private String NSTJIzvrsenja;

    private String komentar;

    private Integer javnanabavkaId;

    private Integer planjavnenabavkeId;

}
