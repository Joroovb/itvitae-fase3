package com.example.bird.repository;

import com.example.bird.model.Bird;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BirdRepository extends CrudRepository<Bird, Long> {}
