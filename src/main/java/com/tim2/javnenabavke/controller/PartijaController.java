package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PartijaDTO;
import com.tim2.javnenabavke.dto.update.PartijaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PartijaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/partija")
public class PartijaController {

    @Autowired
    private PartijaServiceImpl partijaServiceImpl;

    @PostMapping
    public String save(@RequestBody PartijaDTO vO) {
        return partijaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        partijaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PartijaUpdateDTO vO) {
        partijaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PartijaDTO getById(@NotNull @PathVariable("id") Long id) {
        return partijaServiceImpl.getById(id);
    }

    }