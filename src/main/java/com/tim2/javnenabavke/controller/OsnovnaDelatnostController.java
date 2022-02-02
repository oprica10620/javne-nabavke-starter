package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.OsnovnaDelatnostDTO;
import com.tim2.javnenabavke.dto.update.OsnovnaDelatnostUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.OsnovnaDelatnostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/osnovnadelatnost")
public class OsnovnaDelatnostController {

    @Autowired
    private OsnovnaDelatnostServiceImpl osnovnadelatnostServiceImpl;

    @PostMapping
    public String save(@RequestBody OsnovnaDelatnostDTO vO) {
        return osnovnadelatnostServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        osnovnadelatnostServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody OsnovnaDelatnostUpdateDTO vO) {
        osnovnadelatnostServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public OsnovnaDelatnostDTO getById(@NotNull @PathVariable("id") Long id) {
        return osnovnadelatnostServiceImpl.getById(id);
    }

    }