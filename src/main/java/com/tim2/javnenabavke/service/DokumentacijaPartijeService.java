package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.DokumentacijaPartijeDTO;
import com.tim2.javnenabavke.dto.update.DokumentacijaPartijeUpdateDTO;

public interface DokumentacijaPartijeService {
    Long save(DokumentacijaPartijeDTO vO);

    void delete(Long id);

    void update(Long id, DokumentacijaPartijeUpdateDTO vO);

    DokumentacijaPartijeDTO getById(Long id);
}
