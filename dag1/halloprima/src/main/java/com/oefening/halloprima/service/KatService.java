package com.oefening.halloprima.service;

import com.oefening.halloprima.models.Kat;
import com.oefening.halloprima.repository.KatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class KatService {
    @Autowired
    KatRepository katRepository;

    public Optional<Kat> getOneKat(long id) {
        return katRepository.findById(id);
    }

    public Iterable<Kat> getAllKatten() {
        return katRepository.findAll();
    }

    public Kat addKat(Kat kat) {
        return katRepository.save(kat);
    }
}
