package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.StatusJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.StatusJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.StatusJavneNabavkeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/statusjavnenabavke")
public class StatusJavneNabavkeController {

    @Autowired
    private StatusJavneNabavkeServiceImpl statusjavnenabavkeServiceImpl;

    @PostMapping
    public String save(@RequestBody StatusJavneNabavkeDTO vO) {
        return statusjavnenabavkeServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        statusjavnenabavkeServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody StatusJavneNabavkeUpdateDTO vO) {
        statusjavnenabavkeServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public StatusJavneNabavkeDTO getById(@NotNull @PathVariable("id") Long id) {
        return statusjavnenabavkeServiceImpl.getById(id);
    }

    }