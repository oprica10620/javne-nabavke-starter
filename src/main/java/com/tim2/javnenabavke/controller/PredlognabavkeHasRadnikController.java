package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PredlogNabavkeHasRadnikDTO;
import com.tim2.javnenabavke.dto.update.PredlogNabavkeHasRadnikUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PredlogNabavkeHasRadnikServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/predlognabavkeHasRadnik")
public class PredlognabavkeHasRadnikController {

    @Autowired
    private PredlogNabavkeHasRadnikServiceImpl predlognabavkeHasRadnikServiceImpl;

    @PostMapping
    public String save(@RequestBody PredlogNabavkeHasRadnikDTO vO) {
        return predlognabavkeHasRadnikServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        predlognabavkeHasRadnikServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PredlogNabavkeHasRadnikUpdateDTO vO) {
        predlognabavkeHasRadnikServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PredlogNabavkeHasRadnikDTO getById(@NotNull @PathVariable("id") Long id) {
        return predlognabavkeHasRadnikServiceImpl.getById(id);
    }

    }