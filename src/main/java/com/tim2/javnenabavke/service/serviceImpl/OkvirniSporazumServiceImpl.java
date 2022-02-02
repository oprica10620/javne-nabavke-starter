package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.OkvirniSporazumDTO;
import com.tim2.javnenabavke.dto.update.OkvirniSporazumUpdateDTO;
import com.tim2.javnenabavke.entity.OkvirniSporazum;
import com.tim2.javnenabavke.repository.OkvirniSporazumRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OkvirniSporazumServiceImpl implements com.tim2.javnenabavke.service.OkvirniSporazumService {

    @Autowired
    private OkvirniSporazumRepository okvirnisporazumRepository;

    @Override
    public Long save(OkvirniSporazumDTO vO) {
        OkvirniSporazum bean = new OkvirniSporazum();
        BeanUtils.copyProperties(vO, bean);
        bean = okvirnisporazumRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        okvirnisporazumRepository.deleteById(id);
    }

    @Override
    public void update(Long id, OkvirniSporazumUpdateDTO vO) {
        OkvirniSporazum bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        okvirnisporazumRepository.save(bean);
    }

    @Override
    public OkvirniSporazumDTO getById(Long id) {
        OkvirniSporazum original = requireOne(id);
        return toDTO(original);
    }

    private OkvirniSporazumDTO toDTO(OkvirniSporazum original) {
        OkvirniSporazumDTO bean = new OkvirniSporazumDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private OkvirniSporazum requireOne(Long id) {
        return okvirnisporazumRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
