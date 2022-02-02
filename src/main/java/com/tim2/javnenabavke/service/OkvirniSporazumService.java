package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.OkvirniSporazumDTO;
import com.tim2.javnenabavke.dto.update.OkvirniSporazumUpdateDTO;

public interface OkvirniSporazumService {
    Long save(OkvirniSporazumDTO vO);

    void delete(Long id);

    void update(Long id, OkvirniSporazumUpdateDTO vO);

    OkvirniSporazumDTO getById(Long id);
}
