package com.example.vogel.repository;

import com.example.vogel.model.Vogel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface VogelRepository extends CrudRepository<Vogel, Long> {
    // Derived query
    Iterable<Vogel> findByNaam(String naam);
    Integer countByNaam(String naam);
}
