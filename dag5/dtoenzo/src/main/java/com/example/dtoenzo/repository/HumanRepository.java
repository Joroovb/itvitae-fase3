package com.example.dtoenzo.repository;

import com.example.dtoenzo.models.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {
}
