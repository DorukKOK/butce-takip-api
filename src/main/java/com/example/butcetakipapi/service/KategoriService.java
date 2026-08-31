package com.example.butcetakipapi.service;
import com.example.butcetakipapi.model.Kategori;
import com.example.butcetakipapi.repository.KategoriRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriService {
    private final KategoriRepository kategoriRepository;

    public KategoriService(KategoriRepository kategoriRepository) {
        this.kategoriRepository = kategoriRepository;
    }

    public Kategori ekle(Kategori kategori){
        return kategoriRepository.save(kategori);
    }
    public List<Kategori> hepsiniGetir(){
        return kategoriRepository.findAll();
    }
    public Kategori idIleBul(Long id){
        return kategoriRepository.findById(id).orElseThrow();
    }
    public void sil(Long id){
        kategoriRepository.deleteById(id);
    }

}
