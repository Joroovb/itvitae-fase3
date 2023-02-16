package com.example.phonestore.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany
    private List<Worker> workers = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "stores_suppliers",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id")
    )
    private List<Supplier> suppliers = new ArrayList<>();

    private String city;
    private String phoneNumber;

    public Store() {
    }

    public Store(String city, String phoneNumber) {
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
