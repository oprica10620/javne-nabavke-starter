package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.LokacijaDTO;
import com.tim2.javnenabavke.dto.update.LokacijaUpdateDTO;
import com.tim2.javnenabavke.entity.Lokacija;
import com.tim2.javnenabavke.repository.LokacijaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LokacijaServiceImpl implements com.tim2.javnenabavke.service.LokacijaService {

    @Autowired
    private LokacijaRepository lokacijaRepository;

    @Override
    public Long save(LokacijaDTO vO) {
        Lokacija bean = new Lokacija();
        BeanUtils.copyProperties(vO, bean);
        bean = lokacijaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        lokacijaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, LokacijaUpdateDTO vO) {
        Lokacija bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        lokacijaRepository.save(bean);
    }

    @Override
    public LokacijaDTO getById(Long id) {
        Lokacija original = requireOne(id);
        return toDTO(original);
    }

    @Override
    public List<LokacijaDTO> findAll() {
        List<LokacijaDTO> lokacijaDTOList = new ArrayList<>();
        for(Lokacija l: lokacijaRepository.findAll()) {
            lokacijaDTOList.add(toDTO(l));
        }
        return lokacijaDTOList;
    }

    private LokacijaDTO toDTO(Lokacija original) {
        LokacijaDTO bean = new LokacijaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Lokacija requireOne(Long id) {
        return lokacijaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
