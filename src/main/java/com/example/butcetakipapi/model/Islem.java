package com.example.butcetakipapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
public class Islem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private Kategori kategori;

    @Positive(message = "Tutar 0'dan buyuk olmalıdır.")
    @NotNull(message = "Tutar girilmelidir.")
    @Column(nullable = false)
    private Double tutar;


    @NotNull(message = "Islem turu bos olamaz.")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IslemTuru islemTuru;

    private String aciklama;

    @NotNull(message = "Tarih bos olamaz.")
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

    public Kategori getKategori() {return kategori;}

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

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public void setTutar(Double tutar) {
        this.tutar = tutar;
    }
}
