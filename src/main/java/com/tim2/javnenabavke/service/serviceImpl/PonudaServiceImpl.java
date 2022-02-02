package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PonudaDTO;
import com.tim2.javnenabavke.dto.update.PonudaUpdateDTO;
import com.tim2.javnenabavke.entity.Ponuda;
import com.tim2.javnenabavke.repository.PonudaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PonudaServiceImpl implements com.tim2.javnenabavke.service.PonudaService {

    @Autowired
    private PonudaRepository ponudaRepository;

    @Override
    public Long save(PonudaDTO vO) {
        Ponuda bean = new Ponuda();
        BeanUtils.copyProperties(vO, bean);
        bean = ponudaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        ponudaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PonudaUpdateDTO vO) {
        Ponuda bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        ponudaRepository.save(bean);
    }

    @Override
    public PonudaDTO getById(Long id) {
        Ponuda original = requireOne(id);
        return toDTO(original);
    }

    private PonudaDTO toDTO(Ponuda original) {
        PonudaDTO bean = new PonudaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Ponuda requireOne(Long id) {
        return ponudaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
