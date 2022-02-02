package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PredlogNabavkeHasRadnikDTO;
import com.tim2.javnenabavke.dto.update.PredlogNabavkeHasRadnikUpdateDTO;

public interface PredlogNabavkeHasRadnikService {
    Long save(PredlogNabavkeHasRadnikDTO vO);

    void delete(Long id);

    void update(Long id, PredlogNabavkeHasRadnikUpdateDTO vO);

    PredlogNabavkeHasRadnikDTO getById(Long id);
}
