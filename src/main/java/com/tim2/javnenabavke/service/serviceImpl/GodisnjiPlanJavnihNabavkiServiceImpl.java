package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.GodisnjiPlanJavnihNabavkiDTO;
import com.tim2.javnenabavke.dto.update.GodisnjiPlanJavnihNabavkiUpdateDTO;
import com.tim2.javnenabavke.entity.GodisnjiPlanJavnihNabavki;
import com.tim2.javnenabavke.repository.GodisnjiPlanJavnihNabavkiRepository;
import com.tim2.javnenabavke.service.GodisnjiPlanJavnihNabavkiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class GodisnjiPlanJavnihNabavkiServiceImpl implements GodisnjiPlanJavnihNabavkiService {

    @Autowired
    private GodisnjiPlanJavnihNabavkiRepository godisnjiplanjavnihnabavkiRepository;

    @Override
    public Long save(GodisnjiPlanJavnihNabavkiDTO vO) {
        GodisnjiPlanJavnihNabavki bean = new GodisnjiPlanJavnihNabavki();
        BeanUtils.copyProperties(vO, bean);
        bean = godisnjiplanjavnihnabavkiRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        godisnjiplanjavnihnabavkiRepository.deleteById(id);
    }

    @Override
    public void update(Long id, GodisnjiPlanJavnihNabavkiUpdateDTO vO) {
        GodisnjiPlanJavnihNabavki bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        godisnjiplanjavnihnabavkiRepository.save(bean);
    }

    @Override
    public GodisnjiPlanJavnihNabavkiDTO getById(Long id) {
        GodisnjiPlanJavnihNabavki original = requireOne(id);
        return toDTO(original);
    }

    private GodisnjiPlanJavnihNabavkiDTO toDTO(GodisnjiPlanJavnihNabavki original) {
        GodisnjiPlanJavnihNabavkiDTO bean = new GodisnjiPlanJavnihNabavkiDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private GodisnjiPlanJavnihNabavki requireOne(Long id) {
        return godisnjiplanjavnihnabavkiRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
