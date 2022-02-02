package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.RadnikDTO;
import com.tim2.javnenabavke.dto.update.RadnikUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.RadnikServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/radnik")
public class RadnikController {

    @Autowired
    private RadnikServiceImpl radnikServiceImpl;

    @PostMapping
    public String save(@RequestBody RadnikDTO vO) {
        return radnikServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        radnikServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody RadnikUpdateDTO vO) {
        radnikServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public RadnikDTO getById(@NotNull @PathVariable("id") Long id) {
        return radnikServiceImpl.getById(id);
    }

    }