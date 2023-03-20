package com.example.bird.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Schema(description = "Vogel object")
@Entity
public class Bird {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(
            description = "Unique identifier of the vogel.",
            example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Long id;

    @Schema(
            description = "Name of the bird.",
            example = "Jan de Kees",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @Schema(
            description = "Species of bird",
            example = "Parkiet",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String species;

    public Bird() {}

    public Bird(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
