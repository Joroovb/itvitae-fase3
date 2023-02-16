package com.example.phonestore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter // Generate getters
@Setter // Generate setters
@NoArgsConstructor // Generate nul-argumenten constructor
@AllArgsConstructor // Generate alle-argumenten constructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer hourlyRate;

    @ManyToOne
    @JsonIgnore
    private Store store;
}