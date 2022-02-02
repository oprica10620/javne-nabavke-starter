package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.KonkursnaDokumentacijaDTO;
import com.tim2.javnenabavke.dto.update.KonkursnaDokumentacijaUpdateDTO;

public interface KonkursnaDokumentacijaService {
    Long save(KonkursnaDokumentacijaDTO vO);

    void delete(Long id);

    void update(Long id, KonkursnaDokumentacijaUpdateDTO vO);

    KonkursnaDokumentacijaDTO getById(Long id);
}
