package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.NarucilacDTO;
import com.tim2.javnenabavke.dto.update.NarucilacUpdateDTO;
import com.tim2.javnenabavke.entity.Narucilac;
import com.tim2.javnenabavke.repository.NarucilacRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class NarucilacServiceImpl implements com.tim2.javnenabavke.service.NarucilacService {

    @Autowired
    private NarucilacRepository narucilacRepository;

    @Override
    public Long save(NarucilacDTO vO) {
        Narucilac bean = new Narucilac();
        BeanUtils.copyProperties(vO, bean);
        bean = narucilacRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        narucilacRepository.deleteById(id);
    }

    @Override
    public void update(Long id, NarucilacUpdateDTO vO) {
        Narucilac bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        narucilacRepository.save(bean);
    }

    @Override
    public NarucilacDTO getById(Long id) {
        Narucilac original = requireOne(id);
        return toDTO(original);
    }

    private NarucilacDTO toDTO(Narucilac original) {
        NarucilacDTO bean = new NarucilacDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Narucilac requireOne(Long id) {
        return narucilacRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
