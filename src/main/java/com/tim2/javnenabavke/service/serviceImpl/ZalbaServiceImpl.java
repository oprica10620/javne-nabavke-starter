package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.ZalbaDTO;
import com.tim2.javnenabavke.dto.update.ZalbaUpdateDTO;
import com.tim2.javnenabavke.entity.Zalba;
import com.tim2.javnenabavke.repository.ZalbaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ZalbaServiceImpl implements com.tim2.javnenabavke.service.ZalbaService {

    @Autowired
    private ZalbaRepository zalbaRepository;

    @Override
    public Long save(ZalbaDTO vO) {
        Zalba bean = new Zalba();
        BeanUtils.copyProperties(vO, bean);
        bean = zalbaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        zalbaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, ZalbaUpdateDTO vO) {
        Zalba bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        zalbaRepository.save(bean);
    }

    @Override
    public ZalbaDTO getById(Long id) {
        Zalba original = requireOne(id);
        return toDTO(original);
    }

    private ZalbaDTO toDTO(Zalba original) {
        ZalbaDTO bean = new ZalbaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Zalba requireOne(Long id) {
        return zalbaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
