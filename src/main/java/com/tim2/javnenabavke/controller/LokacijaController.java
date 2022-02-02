package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.LokacijaDTO;
import com.tim2.javnenabavke.dto.update.LokacijaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.LokacijaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/lokacija")
public class LokacijaController {

    @Autowired
    private LokacijaServiceImpl lokacijaServiceImpl;

    @GetMapping
    public List<LokacijaDTO> getAll() {
        return lokacijaServiceImpl.findAll();
    }

    @PostMapping
    public String save(@RequestBody LokacijaDTO vO) {
        return lokacijaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        lokacijaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody LokacijaUpdateDTO vO) {
        lokacijaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public LokacijaDTO getById(@NotNull @PathVariable("id") Long id) {
        return lokacijaServiceImpl.getById(id);
    }

    }