package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PredlogNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PredlogNabavkeUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PredlogNabavkeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/predlognabavke")
public class PredlogNabavkeController {

    @Autowired
    private PredlogNabavkeServiceImpl predlognabavkeServiceImpl;

    @PostMapping
    public String save(@RequestBody PredlogNabavkeDTO vO) {
        return predlognabavkeServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        predlognabavkeServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PredlogNabavkeUpdateDTO vO) {
        predlognabavkeServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PredlogNabavkeDTO getById(@NotNull @PathVariable("id") Long id) {
        return predlognabavkeServiceImpl.getById(id);
    }

    }