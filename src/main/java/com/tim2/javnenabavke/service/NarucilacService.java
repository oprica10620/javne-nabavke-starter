package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.NarucilacDTO;
import com.tim2.javnenabavke.dto.update.NarucilacUpdateDTO;

public interface NarucilacService {
    Long save(NarucilacDTO vO);

    void delete(Long id);

    void update(Long id, NarucilacUpdateDTO vO);

    NarucilacDTO getById(Long id);
}
