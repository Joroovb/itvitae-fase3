package com.example.dtoenzo.service;

import com.example.dtoenzo.dto.rabbit.RabbitGetDto;
import com.example.dtoenzo.dto.rabbit.RabbitPostDto;
import com.example.dtoenzo.mapper.RabbitMapper;
import com.example.dtoenzo.models.Human;
import com.example.dtoenzo.models.Rabbit;
import com.example.dtoenzo.repository.HumanRepository;
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

    @Autowired
    HumanRepository humanRepository;

    public RabbitGetDto getRabbitById(Long id) {
        Rabbit rabbit = rabbitRepository.findById(id).get();
        return rabbitMapper.toDto(rabbit);
    }

    public void newRabbit(RabbitPostDto rabbit) {
        Rabbit newRabbit = rabbitMapper.toEntity(rabbit);
        rabbitRepository.save(newRabbit);
    }

    public Rabbit findById(Long rabbitId) {
        return rabbitRepository.findById(rabbitId).get();
    }

    public void addHumanToRabbit(Long rabbitid, Long humanId) {
        Rabbit rabbit = rabbitRepository.findById(rabbitid).get();
        Human human = humanRepository.findById(humanId).get();
        human.getRabbits().add(rabbit);
        rabbit.getHumans().add(human);
        rabbitRepository.save(rabbit);
    }
}
