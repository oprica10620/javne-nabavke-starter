package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.ObavestenjeDTO;
import com.tim2.javnenabavke.dto.update.ObavestenjeUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.ObavestenjeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/obavestenje")
public class ObavestenjeController {

    @Autowired
    private ObavestenjeServiceImpl obavestenjeServiceImpl;

    @PostMapping
    public String save(@RequestBody ObavestenjeDTO vO) {
        return obavestenjeServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        obavestenjeServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody ObavestenjeUpdateDTO vO) {
        obavestenjeServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public ObavestenjeDTO getById(@NotNull @PathVariable("id") Long id) {
        return obavestenjeServiceImpl.getById(id);
    }

    }