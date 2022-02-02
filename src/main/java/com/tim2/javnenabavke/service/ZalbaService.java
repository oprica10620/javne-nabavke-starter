package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.ZalbaDTO;
import com.tim2.javnenabavke.dto.update.ZalbaUpdateDTO;

public interface ZalbaService {
    Long save(ZalbaDTO vO);

    void delete(Long id);

    void update(Long id, ZalbaUpdateDTO vO);

    ZalbaDTO getById(Long id);
}
