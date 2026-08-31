package com.example.butcetakipapi.controller;

import com.example.butcetakipapi.model.Kategori;
import com.example.butcetakipapi.service.KategoriService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kategori")
public class KategoriController {
    private final KategoriService kategoriService;

    public KategoriController(KategoriService kategoriService) {
        this.kategoriService = kategoriService;
    }
    @PostMapping
    public Kategori ekle(@Valid @RequestBody Kategori kategori){
        return kategoriService.ekle(kategori);
    }
    @GetMapping
    public List<Kategori> hepsiniGetir(){
        return kategoriService.hepsiniGetir();
    }
    @GetMapping("/{id}")
    public Kategori idIleBul(Long id){
        return kategoriService.idIleBul(id);
    }
    @DeleteMapping("/{id}")
    public void sil(@PathVariable Long id){
        kategoriService.sil(id);
    }

}
