package nl.joris.joris.controller;

import nl.joris.joris.model.Kat;
import nl.joris.joris.service.KatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/kat")
public class KatController {

    @Autowired
    KatService katService;

    // Create
    // http post
    @PostMapping("/new")
    public Kat newKat(@RequestBody Kat kat) {
        return katService.newKat(kat);
    }

    // Read
    // http get
    @GetMapping("/all")
    public Iterable<Kat> getAllKatten() {
        return katService.getAllKatten();
    }

    @GetMapping("/{id}")
    public Optional<Kat> getKatById(@PathVariable(value = "id") long id) {
        return katService.getKayById(id);
    }

    // Update
    // http put
    @PutMapping("/{id}")
    public Kat updateKatById(@PathVariable(value = "id") long id, @RequestBody Kat kat) {
        return katService.updateKatById(id, kat);
    }

    // Delete
    // http delete
    @DeleteMapping("/{id}")
    public String deleteKatById(@PathVariable(value = "id") long id) {
        return katService.deleteKatById(id);
    }

    @DeleteMapping("/all")
    public void deleteAllKatten() {
        katService.deleteAllKatten();
    }
}
