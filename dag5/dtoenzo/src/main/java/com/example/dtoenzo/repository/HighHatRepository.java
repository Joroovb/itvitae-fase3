package com.example.dtoenzo.repository;

import com.example.dtoenzo.models.HighHat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighHatRepository extends CrudRepository<HighHat, Long> {
}
