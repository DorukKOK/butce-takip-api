package com.example.butcetakipapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Islem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double tutar;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IslemTuru islemTuru;

    private String aciklama;

    @Column(nullable = false)
    private LocalDate tarih;

    public Long getId() {
        return id;
    }

    public double getTutar() {
        return tutar;
    }

    public IslemTuru getIslemTuru() {
        return islemTuru;
    }

    public String getAciklama() {
        return aciklama;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public void setIslemTuru(IslemTuru islemTuru) {
        this.islemTuru = islemTuru;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }
}
