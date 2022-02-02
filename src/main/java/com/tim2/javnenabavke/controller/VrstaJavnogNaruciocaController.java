package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.VrstaJavnogNaruciocaDTO;
import com.tim2.javnenabavke.dto.update.VrstaJavnogNaruciocaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.VrstaJavnogNaruciocaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/vrstajavnognarucioca")
public class VrstaJavnogNaruciocaController {

    @Autowired
    private VrstaJavnogNaruciocaServiceImpl vrstajavnognaruciocaServiceImpl;

    @PostMapping
    public String save(@RequestBody VrstaJavnogNaruciocaDTO vO) {
        return vrstajavnognaruciocaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        vrstajavnognaruciocaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody VrstaJavnogNaruciocaUpdateDTO vO) {
        vrstajavnognaruciocaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public VrstaJavnogNaruciocaDTO getById(@NotNull @PathVariable("id") Long id) {
        return vrstajavnognaruciocaServiceImpl.getById(id);
    }

    }