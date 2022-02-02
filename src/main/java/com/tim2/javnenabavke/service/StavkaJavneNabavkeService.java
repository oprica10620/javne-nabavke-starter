package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.StavkaJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.StavkaJavneNabavkeUpdateDTO;

public interface StavkaJavneNabavkeService {
    Long save(StavkaJavneNabavkeDTO vO);

    void delete(Long id);

    void update(Long id, StavkaJavneNabavkeUpdateDTO vO);

    StavkaJavneNabavkeDTO getById(Long id);
}
