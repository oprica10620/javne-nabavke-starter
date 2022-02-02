package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.UgovorDTO;
import com.tim2.javnenabavke.dto.update.UgovorUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.UgovorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/ugovor")
public class UgovorController {

    @Autowired
    private UgovorServiceImpl ugovorServiceImpl;

    @PostMapping
    public String save(@RequestBody UgovorDTO vO) {
        return ugovorServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        ugovorServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody UgovorUpdateDTO vO) {
        ugovorServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public UgovorDTO getById(@NotNull @PathVariable("id") Long id) {
        return ugovorServiceImpl.getById(id);
    }

    }