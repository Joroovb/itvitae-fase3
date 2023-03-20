package com.example.bird.controller;

import com.example.bird.model.Bird;
import com.example.bird.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class BirdController implements BirdApi{

    @Autowired
    BirdService birdService;

    @Override
    public Bird newBird(@RequestBody Bird bird) {
        return birdService.newBird(bird);
    }

    @Override
    public Bird getBirdById(Long id) {
        return birdService.getBirdById(id);
    }

    @Override
    public Iterable<Bird> getAllBirds() {
        return birdService.getAllBirds();
    }
}
