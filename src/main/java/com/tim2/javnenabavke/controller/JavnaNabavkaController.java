package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.JavnaNabavkaDTO;
import com.tim2.javnenabavke.dto.update.JavnaNabavkaUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.JavnaNabavkaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/javnanabavka")
public class JavnaNabavkaController {

    @Autowired
    private JavnaNabavkaServiceImpl javnanabavkaServiceImpl;

    @PostMapping
    public String save(@RequestBody JavnaNabavkaDTO vO) {
        return javnanabavkaServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        javnanabavkaServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody JavnaNabavkaUpdateDTO vO) {
        javnanabavkaServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public JavnaNabavkaDTO getById(@NotNull @PathVariable("id") Long id) {
        return javnanabavkaServiceImpl.getById(id);
    }

    }