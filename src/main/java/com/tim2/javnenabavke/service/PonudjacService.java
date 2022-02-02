package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PonudjacDTO;
import com.tim2.javnenabavke.dto.update.PonudjacUpdateDTO;

public interface PonudjacService {
    Long save(PonudjacDTO vO);

    void delete(Long id);

    void update(Long id, PonudjacUpdateDTO vO);

    PonudjacDTO getById(Long id);
}
