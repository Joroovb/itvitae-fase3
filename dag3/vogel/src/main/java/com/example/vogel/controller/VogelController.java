package com.example.vogel.controller;

import com.example.vogel.model.Vogel;
import com.example.vogel.service.VogelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/vogel")
public class VogelController {

    @Autowired
    VogelService vogelService;

    // create
    @PostMapping("/new")
    public Vogel newVogel(@RequestBody Vogel vogel) {
        return vogelService.newVogel(vogel);
    }

    // Zoek functie
    @GetMapping("/naam/{naam}")
    public Iterable<Vogel> getVogelByNaam(@PathVariable(value = "naam") String naam) {
        return vogelService.getVogelByNaam(naam);
    }

//    @GetMapping("/soort/{soort}")
//    public Vogel getVogelBySoort(@PathVariable(value = "naam") String naam) {
//
//    }

}
