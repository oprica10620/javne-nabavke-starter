package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.VrstaPostupkaDTO;
import com.tim2.javnenabavke.dto.update.VrstaPostupkaUpdateDTO;
import com.tim2.javnenabavke.entity.VrstaPostupka;
import com.tim2.javnenabavke.repository.VrstaPostupkaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VrstaPostupkaServiceImpl implements com.tim2.javnenabavke.service.VrstaPostupkaService {

    @Autowired
    private VrstaPostupkaRepository vrstapostupkaRepository;

    @Override
    public Long save(VrstaPostupkaDTO vO) {
        VrstaPostupka bean = new VrstaPostupka();
        BeanUtils.copyProperties(vO, bean);
        bean = vrstapostupkaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        vrstapostupkaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, VrstaPostupkaUpdateDTO vO) {
        VrstaPostupka bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        vrstapostupkaRepository.save(bean);
    }

    @Override
    public VrstaPostupkaDTO getById(Long id) {
        VrstaPostupka original = requireOne(id);
        return toDTO(original);
    }

    private VrstaPostupkaDTO toDTO(VrstaPostupka original) {
        VrstaPostupkaDTO bean = new VrstaPostupkaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private VrstaPostupka requireOne(Long id) {
        return vrstapostupkaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
