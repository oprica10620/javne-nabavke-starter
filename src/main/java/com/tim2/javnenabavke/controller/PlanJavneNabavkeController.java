package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PlanJavneNabavkeDTO;
import com.tim2.javnenabavke.dto.update.PlanJavneNabavkeUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PlanJavneNabavkeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/planjavnenabavke")
public class PlanJavneNabavkeController {

    @Autowired
    private PlanJavneNabavkeServiceImpl planjavnenabavkeServiceImpl;

    @PostMapping
    public String save(@RequestBody PlanJavneNabavkeDTO vO) {
        return planjavnenabavkeServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        planjavnenabavkeServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PlanJavneNabavkeUpdateDTO vO) {
        planjavnenabavkeServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PlanJavneNabavkeDTO getById(@NotNull @PathVariable("id") Long id) {
        return planjavnenabavkeServiceImpl.getById(id);
    }

    }