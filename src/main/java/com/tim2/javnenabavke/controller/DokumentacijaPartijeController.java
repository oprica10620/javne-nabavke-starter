package com.tim2.javnenabavke.controller;

import com.sun.istack.NotNull;
import com.tim2.javnenabavke.dto.create.DokumentacijaPartijeDTO;
import com.tim2.javnenabavke.dto.update.DokumentacijaPartijeUpdateDTO;
import com.tim2.javnenabavke.service.DokumentacijaPartijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/dokumentacijapartije")
public class DokumentacijaPartijeController {

    @Autowired
    private DokumentacijaPartijeService dokumentacijapartijeService;

    @PostMapping
    public String save(@RequestBody DokumentacijaPartijeDTO vO) {
        return dokumentacijapartijeService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @PathVariable("id") Long id) {
        dokumentacijapartijeService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@NotNull @PathVariable("id") Long id,
                       @RequestBody DokumentacijaPartijeUpdateDTO vO) {
        dokumentacijapartijeService.update(id, vO);
    }

    @GetMapping("/{id}")
    public DokumentacijaPartijeDTO getById(@NotNull @PathVariable("id") Long id) {
        return dokumentacijapartijeService.getById(id);
    }

}