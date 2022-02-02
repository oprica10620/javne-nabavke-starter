package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.VrstaPredmetaDTO;
import com.tim2.javnenabavke.dto.update.VrstaPredmetaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.VrstaPredmetaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/vrstapredmeta")
public class VrstaPredmetaController {

    @Autowired
    private VrstaPredmetaServiceImpl vrstapredmetaServiceImpl;

    @PostMapping
    public String save(@RequestBody VrstaPredmetaDTO vO) {
        return vrstapredmetaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        vrstapredmetaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody VrstaPredmetaUpdateDTO vO) {
        vrstapredmetaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public VrstaPredmetaDTO getById(@NotNull @PathVariable("id") Long id) {
        return vrstapredmetaServiceImpl.getById(id);
    }

    }