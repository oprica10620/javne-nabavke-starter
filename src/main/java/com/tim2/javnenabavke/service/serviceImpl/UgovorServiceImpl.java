package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.UgovorDTO;
import com.tim2.javnenabavke.dto.update.UgovorUpdateDTO;
import com.tim2.javnenabavke.entity.Ugovor;
import com.tim2.javnenabavke.repository.UgovorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UgovorServiceImpl implements com.tim2.javnenabavke.service.UgovorService {

    @Autowired
    private UgovorRepository ugovorRepository;

    @Override
    public Long save(UgovorDTO vO) {
        Ugovor bean = new Ugovor();
        BeanUtils.copyProperties(vO, bean);
        bean = ugovorRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        ugovorRepository.deleteById(id);
    }

    @Override
    public void update(Long id, UgovorUpdateDTO vO) {
        Ugovor bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        ugovorRepository.save(bean);
    }

    @Override
    public UgovorDTO getById(Long id) {
        Ugovor original = requireOne(id);
        return toDTO(original);
    }

    private UgovorDTO toDTO(Ugovor original) {
        UgovorDTO bean = new UgovorDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Ugovor requireOne(Long id) {
        return ugovorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
