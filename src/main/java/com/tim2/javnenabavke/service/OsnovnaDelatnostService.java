package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.OsnovnaDelatnostDTO;
import com.tim2.javnenabavke.dto.update.OsnovnaDelatnostUpdateDTO;

public interface OsnovnaDelatnostService {
    Long save(OsnovnaDelatnostDTO vO);

    void delete(Long id);

    void update(Long id, OsnovnaDelatnostUpdateDTO vO);

    OsnovnaDelatnostDTO getById(Long id);
}
