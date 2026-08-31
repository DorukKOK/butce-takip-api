package com.example.butcetakipapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Kategori {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Kategori adı boş olamaz.") //uygulama seviyesinde
    @Column(nullable = false) //veritabanı seviyesinde
    private String ad;

    public Long getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
