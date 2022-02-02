package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.GodisnjiPlanJavnihNabavkiDTO;
import com.tim2.javnenabavke.dto.update.GodisnjiPlanJavnihNabavkiUpdateDTO;
import com.tim2.javnenabavke.service.GodisnjiPlanJavnihNabavkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/godisnjiplanjavnihnabavki")
public class GodisnjiPlanJavnihNabavkiController {

    @Autowired
    private GodisnjiPlanJavnihNabavkiService godisnjiplanjavnihnabavkiService;

    @PostMapping
    public String save(@RequestBody GodisnjiPlanJavnihNabavkiDTO vO) {
        return godisnjiplanjavnihnabavkiService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        godisnjiplanjavnihnabavkiService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody GodisnjiPlanJavnihNabavkiUpdateDTO vO) {
        godisnjiplanjavnihnabavkiService.update(id, vO);
    }

    @GetMapping("/{id}")
    public GodisnjiPlanJavnihNabavkiDTO getById(@NotNull @PathVariable("id") Long id) {
        return godisnjiplanjavnihnabavkiService.getById(id);
    }

    }