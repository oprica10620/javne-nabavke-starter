package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.VrstaPredmetaDTO;
import com.tim2.javnenabavke.dto.update.VrstaPredmetaUpdateDTO;

public interface VrstaPredmetaService {
    Long save(VrstaPredmetaDTO vO);

    void delete(Long id);

    void update(Long id, VrstaPredmetaUpdateDTO vO);

    VrstaPredmetaDTO getById(Long id);
}
