package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.VrstaPostupkaDTO;
import com.tim2.javnenabavke.dto.update.VrstaPostupkaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.VrstaPostupkaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/vrstapostupka")
public class VrstaPostupkaController {

    @Autowired
    private VrstaPostupkaServiceImpl vrstapostupkaServiceImpl;

    @PostMapping
    public String save(@RequestBody VrstaPostupkaDTO vO) {
        return vrstapostupkaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        vrstapostupkaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody VrstaPostupkaUpdateDTO vO) {
        vrstapostupkaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public VrstaPostupkaDTO getById(@NotNull @PathVariable("id") Long id) {
        return vrstapostupkaServiceImpl.getById(id);
    }

    }