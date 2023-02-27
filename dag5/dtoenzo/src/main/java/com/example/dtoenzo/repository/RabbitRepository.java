package com.example.dtoenzo.repository;

import com.example.dtoenzo.models.Rabbit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RabbitRepository extends CrudRepository<Rabbit, Long> {
}
