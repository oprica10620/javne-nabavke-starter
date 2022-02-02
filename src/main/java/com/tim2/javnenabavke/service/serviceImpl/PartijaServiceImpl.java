package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PartijaDTO;
import com.tim2.javnenabavke.dto.update.PartijaUpdateDTO;
import com.tim2.javnenabavke.entity.Partija;
import com.tim2.javnenabavke.repository.PartijaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PartijaServiceImpl implements com.tim2.javnenabavke.service.PartijaService {

    @Autowired
    private PartijaRepository partijaRepository;

    @Override
    public Long save(PartijaDTO vO) {
        Partija bean = new Partija();
        BeanUtils.copyProperties(vO, bean);
        bean = partijaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        partijaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PartijaUpdateDTO vO) {
        Partija bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        partijaRepository.save(bean);
    }

    @Override
    public PartijaDTO getById(Long id) {
        Partija original = requireOne(id);
        return toDTO(original);
    }

    private PartijaDTO toDTO(Partija original) {
        PartijaDTO bean = new PartijaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Partija requireOne(Long id) {
        return partijaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
