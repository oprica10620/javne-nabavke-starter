package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.PonudjacDTO;
import com.tim2.javnenabavke.dto.update.PonudjacUpdateDTO;
import com.tim2.javnenabavke.entity.Ponudjac;
import com.tim2.javnenabavke.repository.PonudjacRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PonudjacServiceImpl implements com.tim2.javnenabavke.service.PonudjacService {

    @Autowired
    private PonudjacRepository ponudjacRepository;

    @Override
    public Long save(PonudjacDTO vO) {
        Ponudjac bean = new Ponudjac();
        BeanUtils.copyProperties(vO, bean);
        bean = ponudjacRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        ponudjacRepository.deleteById(id);
    }

    @Override
    public void update(Long id, PonudjacUpdateDTO vO) {
        Ponudjac bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        ponudjacRepository.save(bean);
    }

    @Override
    public PonudjacDTO getById(Long id) {
        Ponudjac original = requireOne(id);
        return toDTO(original);
    }

    private PonudjacDTO toDTO(Ponudjac original) {
        PonudjacDTO bean = new PonudjacDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Ponudjac requireOne(Long id) {
        return ponudjacRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
