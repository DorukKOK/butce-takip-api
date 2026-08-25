package com.example.butcetakipapi.controller;

import com.example.butcetakipapi.model.Islem;
import com.example.butcetakipapi.service.IslemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/islem")
public class IslemController {
    private final IslemService islemService;

    public IslemController(IslemService islemService) {
        this.islemService = islemService;
    }

    //Yeni işlem ekleme
    @PostMapping
    public Islem ekle(@RequestBody Islem islem) {
        return islemService.ekle(islem);
    }

    //Tüm işlemleri getir
    @GetMapping
    public List<Islem> hepsiniGetir() {
        return islemService.hepsiniGetir();
    }

    //Tek işlemi getir
    @GetMapping("/{id}")
    public Islem idIleBul(@PathVariable Long id) {
        return islemService.idIleBul(id);
    }

    //İşlemi sil
    @DeleteMapping("/{id}")
    public void sil(@PathVariable Long id) {
        islemService.sil(id);
    }
}