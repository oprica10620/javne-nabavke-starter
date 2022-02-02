package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.UgovorDTO;
import com.tim2.javnenabavke.dto.update.UgovorUpdateDTO;

public interface UgovorService {
    Long save(UgovorDTO vO);

    void delete(Long id);

    void update(Long id, UgovorUpdateDTO vO);

    UgovorDTO getById(Long id);
}
