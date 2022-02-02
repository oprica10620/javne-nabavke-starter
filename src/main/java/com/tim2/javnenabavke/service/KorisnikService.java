package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.KorisnikDTO;
import com.tim2.javnenabavke.dto.update.KorisnikUpdateDTO;

public interface KorisnikService {
    Long save(KorisnikDTO vO);

    void delete(Long id);

    void update(Long id, KorisnikUpdateDTO vO);

    KorisnikDTO getById(Long id);
}
