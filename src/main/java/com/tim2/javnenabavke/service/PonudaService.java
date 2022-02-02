package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PonudaDTO;
import com.tim2.javnenabavke.dto.update.PonudaUpdateDTO;

public interface PonudaService {
    Long save(PonudaDTO vO);

    void delete(Long id);

    void update(Long id, PonudaUpdateDTO vO);

    PonudaDTO getById(Long id);
}
