package com.example.dtoenzo.controller;

import com.example.dtoenzo.dto.rabbit.RabbitGetDto;
import com.example.dtoenzo.dto.rabbit.RabbitPostDto;
import com.example.dtoenzo.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/rabbit")
public class RabbitController {

    @Autowired
    RabbitService rabbitService;

    @GetMapping("/{id}")
    public RabbitGetDto getRabbitById(@PathVariable(value = "id") Long id) {
        return rabbitService.getRabbitById(id);
    }

    @PostMapping("/new")
    public void newRabbit(@RequestBody RabbitPostDto rabbit) {
        rabbitService.newRabbit(rabbit);
    }

    @PutMapping("/{rabbitid}/{humanid}")
    public void addHumanToRabbit(@PathVariable(value = "rabbitid") Long rabbitid,
                                 @PathVariable(value = "humanid") Long humanId) {
        rabbitService.addHumanToRabbit(rabbitid, humanId);
    }
}
