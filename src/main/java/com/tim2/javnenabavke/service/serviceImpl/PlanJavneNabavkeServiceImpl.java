package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PlanJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PlanJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.entity.PlanJavneNabavke;
import com.tim2.javnenabavke.repository.PlanJavneNabavkeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PlanJavneNabavkeServiceImpl implements com.tim2.javnenabavke.service.PlanJavneNabavkeService {

    @Autowired
    private PlanJavneNabavkeRepository planjavnenabavkeRepository;

    @Override
    public Long save(PlanJavneNabavkeDTO vO) {
        PlanJavneNabavke bean = new PlanJavneNabavke();
        BeanUtils.copyProperties(vO, bean);
        bean = planjavnenabavkeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        planjavnenabavkeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PlanJavneNabavkeUpdateDTO vO) {
        PlanJavneNabavke bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        planjavnenabavkeRepository.save(bean);
    }

    @Override
    public PlanJavneNabavkeDTO getById(Long id) {
        PlanJavneNabavke original = requireOne(id);
        return toDTO(original);
    }

    private PlanJavneNabavkeDTO toDTO(PlanJavneNabavke original) {
        PlanJavneNabavkeDTO bean = new PlanJavneNabavkeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private PlanJavneNabavke requireOne(Long id) {
        return planjavnenabavkeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
