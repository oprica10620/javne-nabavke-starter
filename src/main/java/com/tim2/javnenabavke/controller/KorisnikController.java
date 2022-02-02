package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.KorisnikDTO;
import com.tim2.javnenabavke.dto.update.KorisnikUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.KorisnikServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/korisnik")
public class KorisnikController {

    @Autowired
    private KorisnikServiceImpl korisnikServiceImpl;

    @PostMapping
    public String save(@RequestBody KorisnikDTO vO) {
        return korisnikServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        korisnikServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody KorisnikUpdateDTO vO) {
        korisnikServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public KorisnikDTO getById(@NotNull @PathVariable("id") Long id) {
        return korisnikServiceImpl.getById(id);
    }

    }