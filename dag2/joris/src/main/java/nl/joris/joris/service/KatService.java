package nl.joris.joris.service;

import nl.joris.joris.model.Kat;
import nl.joris.joris.repository.KatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class KatService {

    @Autowired
    KatRepository katRepository;

    public Kat newKat(Kat kat) {
        return katRepository.save(kat);
    }

    public Iterable<Kat> getAllKatten() {
        return katRepository.findAll();
    }

    public Optional<Kat> getKayById(long id) {
        return katRepository.findById(id);
    }

    public String deleteKatById(long id) {
        if (katRepository.existsById(id)) {
            katRepository.deleteById(id);
            return "Goed gedaan!";
        }
        return "Die bestaat helaas niet";
    }

    public void deleteAllKatten() {
        katRepository.deleteAll();
    }

    public Kat updateKatById(long id, Kat kat) {
        if (!katRepository.existsById(id)) { // guard clause
            return null;
        }

        System.out.println(kat.getLeeftijd());
        System.out.println(kat.getNaam());

        return kat;
    }
}
