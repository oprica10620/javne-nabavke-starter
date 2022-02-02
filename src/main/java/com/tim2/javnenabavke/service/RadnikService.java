package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.RadnikDTO;
import com.tim2.javnenabavke.dto.update.RadnikUpdateDTO;

public interface RadnikService {
    Long save(RadnikDTO vO);

    void delete(Long id);

    void update(Long id, RadnikUpdateDTO vO);

    RadnikDTO getById(Long id);
}
