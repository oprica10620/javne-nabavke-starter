package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.VrstaJavnogNaruciocaDTO;
import com.tim2.javnenabavke.dto.update.VrstaJavnogNaruciocaUpdateDTO;

public interface VrstaJavnogNaruciocaService {
    Long save(VrstaJavnogNaruciocaDTO vO);

    void delete(Long id);

    void update(Long id, VrstaJavnogNaruciocaUpdateDTO vO);

    VrstaJavnogNaruciocaDTO getById(Long id);
}
