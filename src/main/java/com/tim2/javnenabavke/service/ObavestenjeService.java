package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.ObavestenjeDTO;
import com.tim2.javnenabavke.dto.update.ObavestenjeUpdateDTO;

public interface ObavestenjeService {
    Long save(ObavestenjeDTO vO);

    void delete(Long id);

    void update(Long id, ObavestenjeUpdateDTO vO);

    ObavestenjeDTO getById(Long id);
}
