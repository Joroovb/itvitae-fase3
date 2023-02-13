package com.example.vogel.service;

import com.example.vogel.model.Vogel;
import com.example.vogel.repository.VogelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VogelService {

    @Autowired
    VogelRepository vogelRepository;

    public Vogel newVogel(Vogel vogel) {
        return vogelRepository.save(vogel);
    }

    public Iterable<Vogel> getVogelByNaam(String naam) {
        return vogelRepository.findByNaam(naam);
    }
}
