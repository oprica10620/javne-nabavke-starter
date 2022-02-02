package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PredmetJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PredmetJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PredmetJavneNabavkeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/predmetjavnenabavke")
public class PredmetJavneNabavkeController {

    @Autowired
    private PredmetJavneNabavkeServiceImpl predmetjavnenabavkeServiceImpl;

    @PostMapping
    public String save(@RequestBody PredmetJavneNabavkeDTO vO) {
        return predmetjavnenabavkeServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        predmetjavnenabavkeServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PredmetJavneNabavkeUpdateDTO vO) {
        predmetjavnenabavkeServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PredmetJavneNabavkeDTO getById(@NotNull @PathVariable("id") Long id) {
        return predmetjavnenabavkeServiceImpl.getById(id);
    }

    }