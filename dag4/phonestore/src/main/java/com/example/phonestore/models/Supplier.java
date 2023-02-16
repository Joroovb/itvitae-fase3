package com.example.phonestore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;
    private String brand;

    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private List<Store> stores = new ArrayList<>();

    public Supplier() {
    }

    public Supplier(String phoneNumber, String brand) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
