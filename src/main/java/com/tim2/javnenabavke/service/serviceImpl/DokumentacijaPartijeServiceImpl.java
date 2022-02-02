package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.DokumentacijaPartijeDTO;
import com.tim2.javnenabavke.dto.update.DokumentacijaPartijeUpdateDTO;
import com.tim2.javnenabavke.entity.DokumentacijaPartije;
import com.tim2.javnenabavke.repository.DokumentacijaPartijeRepository;
import com.tim2.javnenabavke.service.DokumentacijaPartijeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DokumentacijaPartijeServiceImpl implements DokumentacijaPartijeService {

    @Autowired
    private DokumentacijaPartijeRepository dokumentacijapartijeRepository;

    @Override
    public Long save(DokumentacijaPartijeDTO vO) {
        DokumentacijaPartije bean = new DokumentacijaPartije();
        BeanUtils.copyProperties(vO, bean);
        bean = dokumentacijapartijeRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        dokumentacijapartijeRepository.deleteById(id);
    }

    @Override
    public void update(Long id, DokumentacijaPartijeUpdateDTO vO) {
        DokumentacijaPartije bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        dokumentacijapartijeRepository.save(bean);
    }

    @Override
    public DokumentacijaPartijeDTO getById(Long id) {
        DokumentacijaPartije original = requireOne(id);
        return toDTO(original);
    }

    private DokumentacijaPartijeDTO toDTO(DokumentacijaPartije original) {
        DokumentacijaPartijeDTO bean = new DokumentacijaPartijeDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private DokumentacijaPartije requireOne(Long id) {
        return dokumentacijapartijeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
