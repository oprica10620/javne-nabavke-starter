package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.StavkaJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.StavkaJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.StavkaJavneNabavkeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/stavkajavnenabavke")
public class StavkaJavneNabavkeController {

    @Autowired
    private StavkaJavneNabavkeServiceImpl stavkajavnenabavkeServiceImpl;

    @PostMapping
    public String save(@RequestBody StavkaJavneNabavkeDTO vO) {
        return stavkajavnenabavkeServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        stavkajavnenabavkeServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody StavkaJavneNabavkeUpdateDTO vO) {
        stavkajavnenabavkeServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public StavkaJavneNabavkeDTO getById(@NotNull @PathVariable("id") Long id) {
        return stavkajavnenabavkeServiceImpl.getById(id);
    }

    }