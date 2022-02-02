package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.RadnikDTO;
import com.tim2.javnenabavke.dto.update.RadnikUpdateDTO;
import com.tim2.javnenabavke.entity.Radnik;
import com.tim2.javnenabavke.repository.RadnikRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class RadnikServiceImpl implements com.tim2.javnenabavke.service.RadnikService {

    @Autowired
    private RadnikRepository radnikRepository;

    @Override
    public Long save(RadnikDTO vO) {
        Radnik bean = new Radnik();
        BeanUtils.copyProperties(vO, bean);
        bean = radnikRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        radnikRepository.deleteById(id);
    }

    @Override
    public void update(Long id, RadnikUpdateDTO vO) {
        Radnik bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        radnikRepository.save(bean);
    }

    @Override
    public RadnikDTO getById(Long id) {
        Radnik original = requireOne(id);
        return toDTO(original);
    }

    private RadnikDTO toDTO(Radnik original) {
        RadnikDTO bean = new RadnikDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Radnik requireOne(Long id) {
        return radnikRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
