package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PonudaDTO;
import com.tim2.javnenabavke.dto.update.PonudaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PonudaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/ponuda")
public class PonudaController {

    @Autowired
    private PonudaServiceImpl ponudaServiceImpl;

    @PostMapping
    public String save(@RequestBody PonudaDTO vO) {
        return ponudaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        ponudaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PonudaUpdateDTO vO) {
        ponudaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PonudaDTO getById(@NotNull @PathVariable("id") Long id) {
        return ponudaServiceImpl.getById(id);
    }

    }