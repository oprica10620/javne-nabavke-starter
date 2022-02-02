package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.VrstaJavnogNaruciocaDTO;
import com.tim2.javnenabavke.dto.update.VrstaJavnogNaruciocaUpdateDTO;
import com.tim2.javnenabavke.entity.VrstaJavnogNarucioca;
import com.tim2.javnenabavke.repository.VrstaJavnogNaruciocaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VrstaJavnogNaruciocaServiceImpl implements com.tim2.javnenabavke.service.VrstaJavnogNaruciocaService {

    @Autowired
    private VrstaJavnogNaruciocaRepository vrstajavnognaruciocaRepository;

    @Override
    public Long save(VrstaJavnogNaruciocaDTO vO) {
        VrstaJavnogNarucioca bean = new VrstaJavnogNarucioca();
        BeanUtils.copyProperties(vO, bean);
        bean = vrstajavnognaruciocaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        vrstajavnognaruciocaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, VrstaJavnogNaruciocaUpdateDTO vO) {
        VrstaJavnogNarucioca bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        vrstajavnognaruciocaRepository.save(bean);
    }

    @Override
    public VrstaJavnogNaruciocaDTO getById(Long id) {
        VrstaJavnogNarucioca original = requireOne(id);
        return toDTO(original);
    }

    private VrstaJavnogNaruciocaDTO toDTO(VrstaJavnogNarucioca original) {
        VrstaJavnogNaruciocaDTO bean = new VrstaJavnogNaruciocaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private VrstaJavnogNarucioca requireOne(Long id) {
        return vrstajavnognaruciocaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
