package com.example.dtoenzo.service;

import com.example.dtoenzo.models.HighHat;
import com.example.dtoenzo.models.Rabbit;
import com.example.dtoenzo.repository.HighHatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HighHatService {
    @Autowired
    HighHatRepository highHatRepository;
    @Autowired
    RabbitService rabbitService;

    public void newHighHat(Long rabbitId) {
        Rabbit rabbit = rabbitService.findById(rabbitId);
        HighHat hh = new HighHat();
        hh.setRabbit(rabbit);
        highHatRepository.save(hh);
        rabbitService.addHighHat(rabbit, hh);
    }
}
