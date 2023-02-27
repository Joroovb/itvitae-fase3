package com.example.dtoenzo.controller;

import com.example.dtoenzo.service.HighHatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/highhat")
public class HighHatController {

    @Autowired
    HighHatService highHatService;

    @GetMapping("/new/{id}")
    public void newHighHat(@PathVariable(value = "id") Long rabbitId) {
        highHatService.newHighHat(rabbitId);
    }
}
