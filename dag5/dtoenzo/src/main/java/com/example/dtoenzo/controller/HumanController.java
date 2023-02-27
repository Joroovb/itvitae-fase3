package com.example.dtoenzo.controller;

import com.example.dtoenzo.dto.human.HumanGetDto;
import com.example.dtoenzo.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/human")
public class HumanController {
    @Autowired
    private HumanService humanService;

    @PostMapping("/new")
    public void newHuman() {
        humanService.newHuman();
    }

    @GetMapping("/{id}")
    public HumanGetDto getHumanById(@PathVariable(value = "id") Long id) {
        return humanService.getHumanById(id);
    }

}
