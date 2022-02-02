package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.KomisijaHasRadnikDTO;
import com.tim2.javnenabavke.dto.update.KomisijaHasRadnikUpdateDTO;
import com.tim2.javnenabavke.entity.KomisijaHasRadnik;
import com.tim2.javnenabavke.repository.KomisijaHasRadnikRepository;
import com.tim2.javnenabavke.service.KomisijaHasRadnikService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class KomisijaHasRadnikServiceImpl implements KomisijaHasRadnikService {

    @Autowired
    private KomisijaHasRadnikRepository komisijaHasRadnikRepository;

    @Override
    public Long save(KomisijaHasRadnikDTO vO) {
        KomisijaHasRadnik bean = new KomisijaHasRadnik();
        BeanUtils.copyProperties(vO, bean);
        bean = komisijaHasRadnikRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        komisijaHasRadnikRepository.deleteById(id);
    }

    @Override
    public void update(Long id, KomisijaHasRadnikUpdateDTO vO) {
        KomisijaHasRadnik bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        komisijaHasRadnikRepository.save(bean);
    }

    @Override
    public KomisijaHasRadnikDTO getById(Long id) {
        KomisijaHasRadnik original = requireOne(id);
        return toDTO(original);
    }

    private KomisijaHasRadnikDTO toDTO(KomisijaHasRadnik original) {
        KomisijaHasRadnikDTO bean = new KomisijaHasRadnikDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private KomisijaHasRadnik requireOne(Long id) {
        return komisijaHasRadnikRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
