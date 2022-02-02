package com.tim2.javnenabavke.service.serviceImpl;

import com.tim2.javnenabavke.dto.create.KorisnikDTO;
import com.tim2.javnenabavke.dto.update.KorisnikUpdateDTO;
import com.tim2.javnenabavke.entity.Korisnik;
import com.tim2.javnenabavke.repository.KorisnikRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class KorisnikServiceImpl implements com.tim2.javnenabavke.service.KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Override
    public Long save(KorisnikDTO vO) {
        Korisnik bean = new Korisnik();
        BeanUtils.copyProperties(vO, bean);
        bean = korisnikRepository.save(bean);
        return bean.getId();
    }

    @Override
    public void delete(Long id) {
        korisnikRepository.deleteById(id);
    }

    @Override
    public void update(Long id, KorisnikUpdateDTO vO) {
        Korisnik bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        korisnikRepository.save(bean);
    }

    @Override
    public KorisnikDTO getById(Long id) {
        Korisnik original = requireOne(id);
        return toDTO(original);
    }

    private KorisnikDTO toDTO(Korisnik original) {
        KorisnikDTO bean = new KorisnikDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Korisnik requireOne(Long id) {
        return korisnikRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
