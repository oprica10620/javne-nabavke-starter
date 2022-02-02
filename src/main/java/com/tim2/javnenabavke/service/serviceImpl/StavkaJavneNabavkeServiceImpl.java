package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.StavkaJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.StavkaJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.entity.StavkaJavneNabavke;
import com.tim2.javnenabavke.repository.StavkaJavneNabavkeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StavkaJavneNabavkeServiceImpl implements com.tim2.javnenabavke.service.StavkaJavneNabavkeService {

    @Autowired
    private StavkaJavneNabavkeRepository stavkajavnenabavkeRepository;

    @Override
    public Long save(StavkaJavneNabavkeDTO vO) {
        StavkaJavneNabavke bean = new StavkaJavneNabavke();
        BeanUtils.copyProperties(vO, bean);
        bean = stavkajavnenabavkeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        stavkajavnenabavkeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, StavkaJavneNabavkeUpdateDTO vO) {
        StavkaJavneNabavke bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        stavkajavnenabavkeRepository.save(bean);
    }

    @Override
    public StavkaJavneNabavkeDTO getById(Long id) {
        StavkaJavneNabavke original = requireOne(id);
        return toDTO(original);
    }

    private StavkaJavneNabavkeDTO toDTO(StavkaJavneNabavke original) {
        StavkaJavneNabavkeDTO bean = new StavkaJavneNabavkeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private StavkaJavneNabavke requireOne(Long id) {
        return stavkajavnenabavkeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
