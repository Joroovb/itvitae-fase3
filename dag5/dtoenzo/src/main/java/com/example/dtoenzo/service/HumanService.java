package com.example.dtoenzo.service;

import com.example.dtoenzo.dto.human.HumanGetDto;
import com.example.dtoenzo.mapper.HumanMapper;
import com.example.dtoenzo.models.Human;
import com.example.dtoenzo.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HumanService {
    @Autowired
    private HumanRepository humanRepository;

    @Autowired
    private HumanMapper humanMapper;

    public void newHuman() {
        Human human= new Human();
        humanRepository.save(human);
    }

    public HumanGetDto getHumanById(Long id) {
        Human human = humanRepository.findById(id).get();
        return humanMapper.toDto(human);
    }
}
