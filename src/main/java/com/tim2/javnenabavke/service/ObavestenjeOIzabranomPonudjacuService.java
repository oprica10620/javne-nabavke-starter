package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.ObavestenjeOIzabranomPonudjacuDTO;
import com.tim2.javnenabavke.dto.update.ObavestenjeOIzabranomPonudjacuUpdateDTO;

public interface ObavestenjeOIzabranomPonudjacuService {
    Long save(ObavestenjeOIzabranomPonudjacuDTO vO);

    void delete(Long id);

    void update(Long id, ObavestenjeOIzabranomPonudjacuUpdateDTO vO);

    ObavestenjeOIzabranomPonudjacuDTO getById(Long id);
}
