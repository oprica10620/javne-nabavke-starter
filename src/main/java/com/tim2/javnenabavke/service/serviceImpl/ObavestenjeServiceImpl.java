package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.ObavestenjeDTO;
import com.tim2.javnenabavke.dto.update.ObavestenjeUpdateDTO;
import com.tim2.javnenabavke.entity.Obavestenje;
import com.tim2.javnenabavke.repository.ObavestenjeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ObavestenjeServiceImpl implements com.tim2.javnenabavke.service.ObavestenjeService {

    @Autowired
    private ObavestenjeRepository obavestenjeRepository;

    @Override
    public Long save(ObavestenjeDTO vO) {
        Obavestenje bean = new Obavestenje();
        BeanUtils.copyProperties(vO, bean);
        bean = obavestenjeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        obavestenjeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, ObavestenjeUpdateDTO vO) {
        Obavestenje bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        obavestenjeRepository.save(bean);
    }

    @Override
    public ObavestenjeDTO getById(Long id) {
        Obavestenje original = requireOne(id);
        return toDTO(original);
    }

    private ObavestenjeDTO toDTO(Obavestenje original) {
        ObavestenjeDTO bean = new ObavestenjeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Obavestenje requireOne(Long id) {
        return obavestenjeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
