package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.ObjavaPlanaDTO;
import com.tim2.javnenabavke.dto.update.ObjavaPlanaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.ObjavaPlanaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/objavaplana")
public class ObjavaPlanaController {

    @Autowired
    private ObjavaPlanaServiceImpl objavaplanaServiceImpl;

    @PostMapping
    public String save(@RequestBody ObjavaPlanaDTO vO) {
        return objavaplanaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        objavaplanaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody ObjavaPlanaUpdateDTO vO) {
        objavaplanaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public ObjavaPlanaDTO getById(@NotNull @PathVariable("id") Long id) {
        return objavaplanaServiceImpl.getById(id);
    }

    }