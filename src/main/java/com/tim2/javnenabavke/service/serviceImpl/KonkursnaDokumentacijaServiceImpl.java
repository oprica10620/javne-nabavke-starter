package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.KonkursnaDokumentacijaDTO;
import com.tim2.javnenabavke.dto.update.KonkursnaDokumentacijaUpdateDTO;
import com.tim2.javnenabavke.entity.KonkursnaDokumentacija;
import com.tim2.javnenabavke.repository.KonkursnaDokumentacijaRepository;
import com.tim2.javnenabavke.service.KonkursnaDokumentacijaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class KonkursnaDokumentacijaServiceImpl implements KonkursnaDokumentacijaService {

    @Autowired
    private KonkursnaDokumentacijaRepository konkursnadokumentacijaRepository;

    @Override
    public Long save(KonkursnaDokumentacijaDTO vO) {
        KonkursnaDokumentacija bean = new KonkursnaDokumentacija();
        BeanUtils.copyProperties(vO, bean);
        bean = konkursnadokumentacijaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        konkursnadokumentacijaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, KonkursnaDokumentacijaUpdateDTO vO) {
        KonkursnaDokumentacija bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        konkursnadokumentacijaRepository.save(bean);
    }

    @Override
    public KonkursnaDokumentacijaDTO getById(Long id) {
        KonkursnaDokumentacija original = requireOne(id);
        return toDTO(original);
    }

    private KonkursnaDokumentacijaDTO toDTO(KonkursnaDokumentacija original) {
        KonkursnaDokumentacijaDTO bean = new KonkursnaDokumentacijaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private KonkursnaDokumentacija requireOne(Long id) {
        return konkursnadokumentacijaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
