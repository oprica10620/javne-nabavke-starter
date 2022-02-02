package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PartijaDTO;
import com.tim2.javnenabavke.dto.update.PartijaUpdateDTO;

public interface PartijaService {
    Long save(PartijaDTO vO);

    void delete(Long id);

    void update(Long id, PartijaUpdateDTO vO);

    PartijaDTO getById(Long id);
}
