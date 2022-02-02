package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PredlogNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PredlogNabavkeUpdateDTO;

public interface PredlogNabavkeService {
    Long save(PredlogNabavkeDTO vO);

    void delete(Long id);

    void update(Long id, PredlogNabavkeUpdateDTO vO);

    PredlogNabavkeDTO getById(Long id);
}
