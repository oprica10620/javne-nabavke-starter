package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.JavnaNabavkaDTO;
import com.tim2.javnenabavke.dto.update.JavnaNabavkaUpdateDTO;

public interface JavnaNabavkaService {
    Long save(JavnaNabavkaDTO vO);

    void delete(Long id);

    void update(Long id, JavnaNabavkaUpdateDTO vO);

    JavnaNabavkaDTO getById(Long id);
}
