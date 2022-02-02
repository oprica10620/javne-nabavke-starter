package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.ObavestenjeOIzabranomPonudjacuDTO;
import com.tim2.javnenabavke.dto.update.ObavestenjeOIzabranomPonudjacuUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.ObavestenjeOIzabranomPonudjacuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/obavestenjeoizabranomponudjacu")
public class ObavestenjeOIzabranomPonudjacuController {

    @Autowired
    private ObavestenjeOIzabranomPonudjacuServiceImpl obavestenjeoizabranomponudjacuServiceImpl;

    @PostMapping
    public String save(@RequestBody ObavestenjeOIzabranomPonudjacuDTO vO) {
        return obavestenjeoizabranomponudjacuServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        obavestenjeoizabranomponudjacuServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody ObavestenjeOIzabranomPonudjacuUpdateDTO vO) {
        obavestenjeoizabranomponudjacuServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public ObavestenjeOIzabranomPonudjacuDTO getById(@NotNull @PathVariable("id") Long id) {
        return obavestenjeoizabranomponudjacuServiceImpl.getById(id);
    }

    }