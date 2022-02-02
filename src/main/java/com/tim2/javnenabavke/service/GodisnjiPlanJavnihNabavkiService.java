package com.tim2.javnenabavke.service;

import com.tim2.javnenabavke.dto.create.GodisnjiPlanJavnihNabavkiDTO;
import com.tim2.javnenabavke.dto.update.GodisnjiPlanJavnihNabavkiUpdateDTO;

public interface GodisnjiPlanJavnihNabavkiService {
    Long save(GodisnjiPlanJavnihNabavkiDTO vO);

    void delete(Long id);

    void update(Long id, GodisnjiPlanJavnihNabavkiUpdateDTO vO);

    GodisnjiPlanJavnihNabavkiDTO getById(Long id);
}
