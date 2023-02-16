package com.example.phonestore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data // Generate getters & Setter -> Hetzelfde als @Getter + @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;
    private String brand;

    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private List<Store> stores = new ArrayList<>();
}