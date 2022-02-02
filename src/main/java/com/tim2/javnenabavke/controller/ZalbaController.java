package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.ZalbaDTO;
import com.tim2.javnenabavke.dto.update.ZalbaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.ZalbaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/zalba")
public class ZalbaController {

    @Autowired
    private ZalbaServiceImpl zalbaServiceImpl;

    @PostMapping
    public String save(@RequestBody ZalbaDTO vO) {
        return zalbaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        zalbaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody ZalbaUpdateDTO vO) {
        zalbaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public ZalbaDTO getById(@NotNull @PathVariable("id") Long id) {
        return zalbaServiceImpl.getById(id);
    }

    }