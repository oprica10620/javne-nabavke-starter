package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.KomisijaDTO;
import com.tim2.javnenabavke.dto.update.KomisijaUpdateDTO;
import com.tim2.javnenabavke.entity.Komisija;
import com.tim2.javnenabavke.repository.KomisijaRepository;
import com.tim2.javnenabavke.service.KomisijaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class KomisijaServiceImpl implements KomisijaService {

    @Autowired
    private KomisijaRepository komisijaRepository;

    @Override
    public Long save(KomisijaDTO vO) {
        Komisija bean = new Komisija();
        BeanUtils.copyProperties(vO, bean);
        bean = komisijaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        komisijaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, KomisijaUpdateDTO vO) {
        Komisija bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        komisijaRepository.save(bean);
    }

    @Override
    public KomisijaDTO getById(Long id) {
        Komisija original = requireOne(id);
        return toDTO(original);
    }

    private KomisijaDTO toDTO(Komisija original) {
        KomisijaDTO bean = new KomisijaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Komisija requireOne(Long id) {
        return komisijaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
