package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.VrstaPredmetaDTO;
import com.tim2.javnenabavke.dto.update.VrstaPredmetaUpdateDTO;
import com.tim2.javnenabavke.entity.VrstaPredmeta;
import com.tim2.javnenabavke.repository.VrstaPredmetaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VrstaPredmetaServiceImpl implements com.tim2.javnenabavke.service.VrstaPredmetaService {

    @Autowired
    private VrstaPredmetaRepository vrstapredmetaRepository;

    @Override
    public Long save(VrstaPredmetaDTO vO) {
        VrstaPredmeta bean = new VrstaPredmeta();
        BeanUtils.copyProperties(vO, bean);
        bean = vrstapredmetaRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        vrstapredmetaRepository.deleteById(id);
    }

    @Override
    public void update(Long id, VrstaPredmetaUpdateDTO vO) {
        VrstaPredmeta bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        vrstapredmetaRepository.save(bean);
    }

    @Override
    public VrstaPredmetaDTO getById(Long id) {
        VrstaPredmeta original = requireOne(id);
        return toDTO(original);
    }

    private VrstaPredmetaDTO toDTO(VrstaPredmeta original) {
        VrstaPredmetaDTO bean = new VrstaPredmetaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private VrstaPredmeta requireOne(Long id) {
        return vrstapredmetaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
