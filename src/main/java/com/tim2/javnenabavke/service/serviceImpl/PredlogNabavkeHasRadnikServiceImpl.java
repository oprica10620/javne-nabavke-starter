package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PredlogNabavkeHasRadnikDTO;
import com.tim2.javnenabavke.dto.update.PredlogNabavkeHasRadnikUpdateDTO;
import com.tim2.javnenabavke.entity.PredlogNabavkeHasRadnik;
import com.tim2.javnenabavke.repository.PredlogNabavkeHasRadnikRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PredlogNabavkeHasRadnikServiceImpl implements com.tim2.javnenabavke.service.PredlogNabavkeHasRadnikService {

    @Autowired
    private PredlogNabavkeHasRadnikRepository predlognabavkeHasRadnikRepository;

    @Override
    public Long save(PredlogNabavkeHasRadnikDTO vO) {
        PredlogNabavkeHasRadnik bean = new PredlogNabavkeHasRadnik();
        BeanUtils.copyProperties(vO, bean);
        bean = predlognabavkeHasRadnikRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        predlognabavkeHasRadnikRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PredlogNabavkeHasRadnikUpdateDTO vO) {
        PredlogNabavkeHasRadnik bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        predlognabavkeHasRadnikRepository.save(bean);
    }

    @Override
    public PredlogNabavkeHasRadnikDTO getById(Long id) {
        PredlogNabavkeHasRadnik original = requireOne(id);
        return toDTO(original);
    }

    private PredlogNabavkeHasRadnikDTO toDTO(PredlogNabavkeHasRadnik original) {
        PredlogNabavkeHasRadnikDTO bean = new PredlogNabavkeHasRadnikDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private PredlogNabavkeHasRadnik requireOne(Long id) {
        return predlognabavkeHasRadnikRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
