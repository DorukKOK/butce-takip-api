package com.example.butcetakipapi.model;

public class KategoriOzetiDTO {
    private String kategoriAdi;
    private Double toplam;

    public KategoriOzetiDTO(String kategoriAdi, Double toplam) {
        this.kategoriAdi = kategoriAdi;
        this.toplam = toplam;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public Double getToplam() {
        return toplam;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public void setToplam(Double toplam) {
        this.toplam = toplam;
    }
}
