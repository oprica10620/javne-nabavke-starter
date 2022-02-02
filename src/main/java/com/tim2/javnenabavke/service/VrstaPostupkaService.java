package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.VrstaPostupkaDTO;
import com.tim2.javnenabavke.dto.update.VrstaPostupkaUpdateDTO;

public interface VrstaPostupkaService {
    Long save(VrstaPostupkaDTO vO);

    void delete(Long id);

    void update(Long id, VrstaPostupkaUpdateDTO vO);

    VrstaPostupkaDTO getById(Long id);
}
