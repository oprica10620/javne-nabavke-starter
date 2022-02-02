package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.KonkursnaDokumentacijaDTO;
import com.tim2.javnenabavke.dto.update.KonkursnaDokumentacijaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.KonkursnaDokumentacijaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/konkursnadokumentacija")
public class KonkursnaDokumentacijaController {

    @Autowired
    private KonkursnaDokumentacijaServiceImpl konkursnadokumentacijaServiceImpl;

    @PostMapping
    public String save(@RequestBody KonkursnaDokumentacijaDTO vO) {
        return konkursnadokumentacijaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        konkursnadokumentacijaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody KonkursnaDokumentacijaUpdateDTO vO) {
        konkursnadokumentacijaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public KonkursnaDokumentacijaDTO getById(@NotNull @PathVariable("id") Long id) {
        return konkursnadokumentacijaServiceImpl.getById(id);
    }

    }