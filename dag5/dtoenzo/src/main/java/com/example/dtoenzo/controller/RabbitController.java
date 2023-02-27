package com.example.dtoenzo.controller;

import com.example.dtoenzo.dto.RabbitDto;
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
    public RabbitDto getRabbitById(@PathVariable(value = "id") Long id) {
        return rabbitService.getRabbitById(id);
    }
}
