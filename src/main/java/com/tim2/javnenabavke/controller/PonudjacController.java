package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PonudjacDTO;
import com.tim2.javnenabavke.dto.update.PonudjacUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PonudjacServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/ponudjac")
public class PonudjacController {

    @Autowired
    private PonudjacServiceImpl ponudjacServiceImpl;

    @PostMapping
    public String save(@RequestBody PonudjacDTO vO) {
        return ponudjacServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        ponudjacServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PonudjacUpdateDTO vO) {
        ponudjacServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PonudjacDTO getById(@NotNull @PathVariable("id") Long id) {
        return ponudjacServiceImpl.getById(id);
    }

    }