package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.KomisijaDTO;
import com.tim2.javnenabavke.dto.update.KomisijaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.KomisijaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/komisija")
public class KomisijaController {

    @Autowired
    private KomisijaServiceImpl komisijaServiceImpl;

    @PostMapping
    public String save(@RequestBody KomisijaDTO vO) {
        return komisijaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        komisijaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody KomisijaUpdateDTO vO) {
        komisijaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public KomisijaDTO getById(@NotNull @PathVariable("id") Long id) {
        return komisijaServiceImpl.getById(id);
    }

    }