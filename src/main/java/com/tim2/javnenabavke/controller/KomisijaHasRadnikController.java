package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.KomisijaHasRadnikDTO;
import com.tim2.javnenabavke.dto.update.KomisijaHasRadnikUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.KomisijaHasRadnikServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/komisijaHasRadnik")
public class KomisijaHasRadnikController {

    @Autowired
    private KomisijaHasRadnikServiceImpl komisijaHasRadnikServiceImpl;

    @PostMapping
    public String save(@RequestBody KomisijaHasRadnikDTO vO) {
        return komisijaHasRadnikServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        komisijaHasRadnikServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody KomisijaHasRadnikUpdateDTO vO) {
        komisijaHasRadnikServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public KomisijaHasRadnikDTO getById(@NotNull @PathVariable("id") Long id) {
        return komisijaHasRadnikServiceImpl.getById(id);
    }

    }