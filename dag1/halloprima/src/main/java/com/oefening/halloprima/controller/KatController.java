package com.oefening.halloprima.controller;

import com.oefening.halloprima.models.Kat;
import com.oefening.halloprima.service.KatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/kat")
public class KatController {

    @Autowired
    KatService katService;

    @GetMapping("/{id}")
    public Optional<Kat> getOneKat(@PathVariable(value = "id") long id) {
       return katService.getOneKat(id);
    }

    @GetMapping("/all")
    public Iterable<Kat> getAllKatten() {
        return katService.getAllKatten();
    }

    @PostMapping("/new")
    public Kat addKat(@RequestBody Kat kat) {
        return katService.addKat(kat);
    }
}
