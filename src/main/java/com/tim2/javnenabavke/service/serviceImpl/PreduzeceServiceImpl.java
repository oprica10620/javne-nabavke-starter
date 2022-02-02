package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PreduzeceDTO;
import com.tim2.javnenabavke.dto.update.PreduzeceUpdateDTO;
import com.tim2.javnenabavke.entity.Preduzece;
import com.tim2.javnenabavke.repository.PreduzeceRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PreduzeceServiceImpl implements com.tim2.javnenabavke.service.PreduzeceService {

    @Autowired
    private PreduzeceRepository preduzeceRepository;

    @Override
    public Long save(PreduzeceDTO vO) {
        Preduzece bean = new Preduzece();
        BeanUtils.copyProperties(vO, bean);
        bean = preduzeceRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        preduzeceRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PreduzeceUpdateDTO vO) {
        Preduzece bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        preduzeceRepository.save(bean);
    }

    @Override
    public PreduzeceDTO getById(Long id) {
        Preduzece original = requireOne(id);
        return toDTO(original);
    }

    private PreduzeceDTO toDTO(Preduzece original) {
        PreduzeceDTO bean = new PreduzeceDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Preduzece requireOne(Long id) {
        return preduzeceRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
