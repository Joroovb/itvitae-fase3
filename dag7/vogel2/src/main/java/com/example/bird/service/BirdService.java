package com.example.bird.service;

import com.example.bird.model.Bird;
import com.example.bird.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirdService {

    @Autowired
    BirdRepository birdRepository;

    public Bird newBird(Bird bird) {
        return birdRepository.save(bird);
    }

    public Iterable<Bird> getAllBirds() {
        return birdRepository.findAll();
    }

    public Bird getBirdById(Long id) {
        return birdRepository.findById(id).get();
    }
}
