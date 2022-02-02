package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.JavnaNabavkaDTO;
import com.tim2.javnenabavke.dto.update.JavnaNabavkaUpdateDTO;
import com.tim2.javnenabavke.entity.JavnaNabavka;
import com.tim2.javnenabavke.repository.JavnaNabavkaRepository;
import com.tim2.javnenabavke.service.JavnaNabavkaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class JavnaNabavkaServiceImpl implements JavnaNabavkaService {

    @Autowired
    private JavnaNabavkaRepository javnanabavkaRepository;

    @Override
    public Long save(JavnaNabavkaDTO vO) {
        JavnaNabavka bean = new JavnaNabavka();
        BeanUtils.copyProperties(vO, bean);
        bean = javnanabavkaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        javnanabavkaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, JavnaNabavkaUpdateDTO vO) {
        JavnaNabavka bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        javnanabavkaRepository.save(bean);
    }

    @Override
    public JavnaNabavkaDTO getById(Long id) {
        JavnaNabavka original = requireOne(id);
        return toDTO(original);
    }

    private JavnaNabavkaDTO toDTO(JavnaNabavka original) {
        JavnaNabavkaDTO bean = new JavnaNabavkaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private JavnaNabavka requireOne(Long id) {
        return javnanabavkaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
