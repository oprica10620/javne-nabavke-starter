package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PredmetJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PredmetJavneNabavkeUpdateDTO;

public interface PredmetJavneNabavkeService {
    Long save(PredmetJavneNabavkeDTO vO);

    void delete(Long id);

    void update(Long id, PredmetJavneNabavkeUpdateDTO vO);

    PredmetJavneNabavkeDTO getById(Long id);
}
