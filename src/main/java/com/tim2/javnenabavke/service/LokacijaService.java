package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.LokacijaDTO;
import com.tim2.javnenabavke.dto.update.LokacijaUpdateDTO;

import java.util.List;

public interface LokacijaService {
    Long save(LokacijaDTO vO);

    void delete(Long id);

    void update(Long id, LokacijaUpdateDTO vO);

    LokacijaDTO getById(Long id);

    List<LokacijaDTO> findAll();
}
