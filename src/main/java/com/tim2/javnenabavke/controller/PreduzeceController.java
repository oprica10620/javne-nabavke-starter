package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.PreduzeceDTO;
import com.tim2.javnenabavke.dto.update.PreduzeceUpdateDTO;
import com.tim2.javnenabavke.service.serviceImpl.PreduzeceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/preduzece")
public class PreduzeceController {

    @Autowired
    private PreduzeceServiceImpl preduzeceServiceImpl;

    @PostMapping
    public String save(@RequestBody PreduzeceDTO vO) {
        return preduzeceServiceImpl.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        preduzeceServiceImpl.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody PreduzeceUpdateDTO vO) {
        preduzeceServiceImpl.update(id, vO);
    }

    @GetMapping("/{id}")
    public PreduzeceDTO getById(@NotNull @PathVariable("id") Long id) {
        return preduzeceServiceImpl.getById(id);
    }

    }