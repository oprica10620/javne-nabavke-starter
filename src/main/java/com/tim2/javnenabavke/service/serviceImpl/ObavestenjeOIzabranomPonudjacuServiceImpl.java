package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.ObavestenjeOIzabranomPonudjacuDTO;
import com.tim2.javnenabavke.dto.update.ObavestenjeOIzabranomPonudjacuUpdateDTO;
import com.tim2.javnenabavke.entity.ObavestenjeOIzabranomPonudjacu;
import com.tim2.javnenabavke.repository.ObavestenjeOIzabranomPonudjacuRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ObavestenjeOIzabranomPonudjacuServiceImpl implements com.tim2.javnenabavke.service.ObavestenjeOIzabranomPonudjacuService {

    @Autowired
    private ObavestenjeOIzabranomPonudjacuRepository obavestenjeoizabranomponudjacuRepository;

    @Override
    public Long save(ObavestenjeOIzabranomPonudjacuDTO vO) {
        ObavestenjeOIzabranomPonudjacu bean = new ObavestenjeOIzabranomPonudjacu();
        BeanUtils.copyProperties(vO, bean);
        bean = obavestenjeoizabranomponudjacuRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        obavestenjeoizabranomponudjacuRepository.deleteById(id);
    }

    @Override
    public void update(Long id, ObavestenjeOIzabranomPonudjacuUpdateDTO vO) {
        ObavestenjeOIzabranomPonudjacu bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        obavestenjeoizabranomponudjacuRepository.save(bean);
    }

    @Override
    public ObavestenjeOIzabranomPonudjacuDTO getById(Long id) {
        ObavestenjeOIzabranomPonudjacu original = requireOne(id);
        return toDTO(original);
    }

    private ObavestenjeOIzabranomPonudjacuDTO toDTO(ObavestenjeOIzabranomPonudjacu original) {
        ObavestenjeOIzabranomPonudjacuDTO bean = new ObavestenjeOIzabranomPonudjacuDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private ObavestenjeOIzabranomPonudjacu requireOne(Long id) {
        return obavestenjeoizabranomponudjacuRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
