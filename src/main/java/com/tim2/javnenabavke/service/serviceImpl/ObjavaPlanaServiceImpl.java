package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.ObjavaPlanaDTO;
import com.tim2.javnenabavke.dto.update.ObjavaPlanaUpdateDTO;
import com.tim2.javnenabavke.entity.ObjavaPlana;
import com.tim2.javnenabavke.repository.ObjavaPlanaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ObjavaPlanaServiceImpl implements com.tim2.javnenabavke.service.ObjavaPlanaService {

    @Autowired
    private ObjavaPlanaRepository objavaplanaRepository;

    @Override
    public Long save(ObjavaPlanaDTO vO) {
        ObjavaPlana bean = new ObjavaPlana();
        BeanUtils.copyProperties(vO, bean);
        bean = objavaplanaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        objavaplanaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, ObjavaPlanaUpdateDTO vO) {
        ObjavaPlana bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        objavaplanaRepository.save(bean);
    }

    @Override
    public ObjavaPlanaDTO getById(Long id) {
        ObjavaPlana original = requireOne(id);
        return toDTO(original);
    }

    private ObjavaPlanaDTO toDTO(ObjavaPlana original) {
        ObjavaPlanaDTO bean = new ObjavaPlanaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private ObjavaPlana requireOne(Long id) {
        return objavaplanaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
