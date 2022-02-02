package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.OkvirniSporazumDTO;
import com.tim2.javnenabavke.dto.update.OkvirniSporazumUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.OkvirniSporazumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/okvirnisporazum")
public class OkvirniSporazumController {

    @Autowired
    private OkvirniSporazumServiceImpl okvirnisporazumServiceImpl;

    @PostMapping
    public String save(@RequestBody OkvirniSporazumDTO vO) {
        return okvirnisporazumServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        okvirnisporazumServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody OkvirniSporazumUpdateDTO vO) {
        okvirnisporazumServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public OkvirniSporazumDTO getById(@NotNull @PathVariable("id") Long id) {
        return okvirnisporazumServiceImpl.getById(id);
    }

    }