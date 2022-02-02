package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.KomisijaHasRadnikDTO;
import com.tim2.javnenabavke.dto.update.KomisijaHasRadnikUpdateDTO;

public interface KomisijaHasRadnikService {
    Long save(KomisijaHasRadnikDTO vO);

    void delete(Long id);

    void update(Long id, KomisijaHasRadnikUpdateDTO vO);

    KomisijaHasRadnikDTO getById(Long id);
}
