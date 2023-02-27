package com.example.dtoenzo.service;

import com.example.dtoenzo.dto.RabbitGetDto;
import com.example.dtoenzo.dto.RabbitPostDto;
import com.example.dtoenzo.mapper.RabbitMapper;
import com.example.dtoenzo.models.HighHat;
import com.example.dtoenzo.models.Rabbit;
import com.example.dtoenzo.repository.HighHatRepository;
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
    HighHatRepository highHatRepository;

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

    public void addHighHat(Rabbit rabbit,HighHat hh) {
        rabbit.setHighHat(hh);
        rabbitRepository.save(rabbit);
    }
}
