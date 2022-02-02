package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PreduzeceDTO;
import com.tim2.javnenabavke.dto.update.PreduzeceUpdateDTO;

public interface PreduzeceService {
    Long save(PreduzeceDTO vO);

    void delete(Long id);

    void update(Long id, PreduzeceUpdateDTO vO);

    PreduzeceDTO getById(Long id);
}
