package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PredmetJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PredmetJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.entity.PredmetJavneNabavke;
import com.tim2.javnenabavke.repository.PredmetJavneNabavkeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PredmetJavneNabavkeServiceImpl implements com.tim2.javnenabavke.service.PredmetJavneNabavkeService {

    @Autowired
    private PredmetJavneNabavkeRepository predmetjavnenabavkeRepository;

    @Override
    public Long save(PredmetJavneNabavkeDTO vO) {
        PredmetJavneNabavke bean = new PredmetJavneNabavke();
        BeanUtils.copyProperties(vO, bean);
        bean = predmetjavnenabavkeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        predmetjavnenabavkeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PredmetJavneNabavkeUpdateDTO vO) {
        PredmetJavneNabavke bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        predmetjavnenabavkeRepository.save(bean);
    }

    @Override
    public PredmetJavneNabavkeDTO getById(Long id) {
        PredmetJavneNabavke original = requireOne(id);
        return toDTO(original);
    }

    private PredmetJavneNabavkeDTO toDTO(PredmetJavneNabavke original) {
        PredmetJavneNabavkeDTO bean = new PredmetJavneNabavkeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private PredmetJavneNabavke requireOne(Long id) {
        return predmetjavnenabavkeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
