package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PredlogNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PredlogNabavkeUpdateDTO;
import com.tim2.javnenabavke.entity.PredlogNabavke;
import com.tim2.javnenabavke.repository.PredlogNabavkeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PredlogNabavkeServiceImpl implements com.tim2.javnenabavke.service.PredlogNabavkeService {

    @Autowired
    private PredlogNabavkeRepository predlognabavkeRepository;

    @Override
    public Long save(PredlogNabavkeDTO vO) {
        PredlogNabavke bean = new PredlogNabavke();
        BeanUtils.copyProperties(vO, bean);
        bean = predlognabavkeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        predlognabavkeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PredlogNabavkeUpdateDTO vO) {
        PredlogNabavke bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        predlognabavkeRepository.save(bean);
    }

    @Override
    public PredlogNabavkeDTO getById(Long id) {
        PredlogNabavke original = requireOne(id);
        return toDTO(original);
    }

    private PredlogNabavkeDTO toDTO(PredlogNabavke original) {
        PredlogNabavkeDTO bean = new PredlogNabavkeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private PredlogNabavke requireOne(Long id) {
        return predlognabavkeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
