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
        System.out.println("We hebben iets binnen gehad");
        return vogelService.newVogel(vogel);
    }

    @GetMapping("/testvogel")
    public String testVogel() {
        System.out.println("Test vogel aangeroepen");
        vogelService.testVogel();
        return "Er is een test vogel voor je aangemaakt!";
    }

    @GetMapping("/all")
    public Iterable<Vogel> getAllVogels() {
        return vogelService.getAllVogels();
    }

    // Zoek functie
    @GetMapping("/naam/{naam}")
    public Iterable<Vogel> getVogelByNaam(@PathVariable(value = "naam") String naam) {
        return vogelService.getVogelByNaam(naam);
    }

    @GetMapping("/naam/count/{naam}")
    public Integer getCountVogelByNaam(@PathVariable(value = "naam") String naam) {
        return vogelService.getCountVogelByNaam(naam);
    }

//    @GetMapping("/soort/{soort}")
//    public Vogel getVogelBySoort(@PathVariable(value = "naam") String naam) {
//
//    }

}
