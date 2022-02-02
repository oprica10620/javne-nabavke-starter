package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.KomisijaDTO;
import com.tim2.javnenabavke.dto.update.KomisijaUpdateDTO;

public interface KomisijaService {
    Long save(KomisijaDTO vO);

    void delete(Long id);

    void update(Long id, KomisijaUpdateDTO vO);

    KomisijaDTO getById(Long id);
}
