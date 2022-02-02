package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.StatusJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.StatusJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.entity.StatusJavneNabavke;
import com.tim2.javnenabavke.repository.StatusJavneNabavkeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StatusJavneNabavkeServiceImpl implements com.tim2.javnenabavke.service.StatusJavneNabavkeService {

    @Autowired
    private StatusJavneNabavkeRepository statusjavnenabavkeRepository;

    @Override
    public Long save(StatusJavneNabavkeDTO vO) {
        StatusJavneNabavke bean = new StatusJavneNabavke();
        BeanUtils.copyProperties(vO, bean);
        bean = statusjavnenabavkeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        statusjavnenabavkeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, StatusJavneNabavkeUpdateDTO vO) {
        StatusJavneNabavke bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        statusjavnenabavkeRepository.save(bean);
    }

    @Override
    public StatusJavneNabavkeDTO getById(Long id) {
        StatusJavneNabavke original = requireOne(id);
        return toDTO(original);
    }

    private StatusJavneNabavkeDTO toDTO(StatusJavneNabavke original) {
        StatusJavneNabavkeDTO bean = new StatusJavneNabavkeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private StatusJavneNabavke requireOne(Long id) {
        return statusjavnenabavkeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
