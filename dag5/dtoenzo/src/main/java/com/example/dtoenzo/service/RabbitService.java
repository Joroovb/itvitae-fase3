package com.example.dtoenzo.service;

import com.example.dtoenzo.dto.RabbitDto;
import com.example.dtoenzo.mapper.RabbitMapper;
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

    @Autowired
    RabbitMapper rabbitMapper;

    public RabbitDto getRabbitById(Long id) {
        Rabbit rabbit = rabbitRepository.findById(id).get();
        return rabbitMapper.toDto(rabbit);
    }

    public void newRabbit(RabbitDto rabbit) {
        Rabbit newRabbit = rabbitMapper.toEntity(rabbit);
        rabbitRepository.save(newRabbit);
    }
}
