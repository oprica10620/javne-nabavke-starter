package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.ObjavaPlanaDTO;
import com.tim2.javnenabavke.dto.update.ObjavaPlanaUpdateDTO;

public interface ObjavaPlanaService {
    Long save(ObjavaPlanaDTO vO);

    void delete(Long id);

    void update(Long id, ObjavaPlanaUpdateDTO vO);

    ObjavaPlanaDTO getById(Long id);
}
