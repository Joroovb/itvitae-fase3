package com.example.dtoenzo.service;

import com.example.dtoenzo.dto.RabbitDto;
import com.example.dtoenzo.models.Rabbit;
import com.example.dtoenzo.repository.RabbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RabbitService {

    @Autowired
    RabbitRepository rabbitRepository;
    public RabbitDto getRabbitById(Long id) {
        Rabbit rabbit = rabbitRepository.findById(id).get();
        RabbitDto temp = new RabbitDto();
        temp.setAge(rabbit.getAge()); // Mapping
        temp.setName(rabbit.getName());
        return temp;
    }
}
