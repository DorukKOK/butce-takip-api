package com.example.butcetakipapi.controller;

import com.example.butcetakipapi.service.IslemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
