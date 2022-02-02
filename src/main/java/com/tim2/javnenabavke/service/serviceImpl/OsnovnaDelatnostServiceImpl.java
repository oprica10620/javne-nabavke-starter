package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.OsnovnaDelatnostDTO;
import com.tim2.javnenabavke.dto.update.OsnovnaDelatnostUpdateDTO;
import com.tim2.javnenabavke.entity.OsnovnaDelatnost;
import com.tim2.javnenabavke.repository.OsnovnaDelatnostRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OsnovnaDelatnostServiceImpl implements com.tim2.javnenabavke.service.OsnovnaDelatnostService {

    @Autowired
    private OsnovnaDelatnostRepository osnovnadelatnostRepository;

    @Override
    public Long save(OsnovnaDelatnostDTO vO) {
        OsnovnaDelatnost bean = new OsnovnaDelatnost();
        BeanUtils.copyProperties(vO, bean);
        bean = osnovnadelatnostRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        osnovnadelatnostRepository.deleteById(id);
    }

    @Override
    public void update(Long id, OsnovnaDelatnostUpdateDTO vO) {
        OsnovnaDelatnost bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        osnovnadelatnostRepository.save(bean);
    }

    @Override
    public OsnovnaDelatnostDTO getById(Long id) {
        OsnovnaDelatnost original = requireOne(id);
        return toDTO(original);
    }

    private OsnovnaDelatnostDTO toDTO(OsnovnaDelatnost original) {
        OsnovnaDelatnostDTO bean = new OsnovnaDelatnostDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private OsnovnaDelatnost requireOne(Long id) {
        return osnovnadelatnostRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
