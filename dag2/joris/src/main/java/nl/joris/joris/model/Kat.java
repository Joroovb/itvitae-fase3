package nl.joris.joris.model;

import jakarta.persistence.*;
import org.springframework.data.relational.core.sql.In;

// One to one
// many to one
// one to many
// many to many


@Entity
public class Kat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String naam;
    private Integer leeftijd;

    @OneToOne
    @JoinColumn(name = "chip_id")
    private Chip chip;

    // default constructor
    public Kat() {}

    // constructor om alle velden behalve id te zetten
    public Kat(String naam, Integer leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public Long getId() {
        return id;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }
}
