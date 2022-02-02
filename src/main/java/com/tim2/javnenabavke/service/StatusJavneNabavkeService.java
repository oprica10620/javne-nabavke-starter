package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.StatusJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.StatusJavneNabavkeUpdateDTO;

public interface StatusJavneNabavkeService {
    Long save(StatusJavneNabavkeDTO vO);

    void delete(Long id);

    void update(Long id, StatusJavneNabavkeUpdateDTO vO);

    StatusJavneNabavkeDTO getById(Long id);
}
