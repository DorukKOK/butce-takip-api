package com.example.butcetakipapi.controller;

import com.example.butcetakipapi.model.KategoriOzetiDTO;
import com.example.butcetakipapi.repository.IslemRepository;
import com.example.butcetakipapi.service.IslemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rapor")
public class RaporController {
    private final IslemService islemService;
    public RaporController(IslemService islemService) {
        this.islemService = islemService;
    }
    @GetMapping("/toplamGelir")
    public Double toplamGelir(){
        return islemService.toplamGelir();
    }
    @GetMapping("/toplamGider")
    public Double toplamGider(){
        return islemService.toplamGider();
    }
    @GetMapping("/bakiye")
    public Double bakiye(){
        return islemService.bakiye();
    }
    @GetMapping("/kategori/{kategoriId}")
    public Double kategoriToplami(@PathVariable Long kategoriId) {
        return islemService.kategoriToplami(kategoriId);
    }
    @GetMapping("/kategoriler")
    public List<KategoriOzetiDTO> kategoriOzeti(){
        return islemService.kategoriOzeti();
    }




}
