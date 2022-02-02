package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.PlanJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PlanJavneNabavkeUpdateDTO;

public interface PlanJavneNabavkeService {
    Long save(PlanJavneNabavkeDTO vO);

    void delete(Long id);

    void update(Long id, PlanJavneNabavkeUpdateDTO vO);

    PlanJavneNabavkeDTO getById(Long id);
}
