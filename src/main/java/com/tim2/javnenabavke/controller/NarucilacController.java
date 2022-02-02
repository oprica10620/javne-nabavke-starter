package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.NarucilacDTO;
import com.tim2.javnenabavke.dto.update.NarucilacUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.NarucilacServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/narucilac")
public class NarucilacController {

    @Autowired
    private NarucilacServiceImpl narucilacServiceImpl;

    @PostMapping
    public String save(@RequestBody NarucilacDTO vO) {
        return narucilacServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        narucilacServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody NarucilacUpdateDTO vO) {
        narucilacServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public NarucilacDTO getById(@NotNull @PathVariable("id") Long id) {
        return narucilacServiceImpl.getById(id);
    }

    }