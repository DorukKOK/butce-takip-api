package com.example.butcetakipapi.service;

import com.example.butcetakipapi.model.Islem;
import com.example.butcetakipapi.repository.IslemRepository;
import org.springframework.stereotype.Service;
import com.example.butcetakipapi.model.IslemTuru;

import java.util.List;

@Service
public class IslemService {
    private final IslemRepository islemRepository;

    public IslemService(IslemRepository islemRepository) {
        this.islemRepository = islemRepository;
    }
    //Yeni işlem ekleyelim
    public Islem ekle(Islem islem){
        return islemRepository.save(islem);
    }
    //Tüm işlemleri getirelim
    public List<Islem> hepsiniGetir(){
        return islemRepository.findAll();
    }
    //Tek işlemi id ile getir
    public Islem idIleBul(Long id){
        return islemRepository.findById(id).orElseThrow();
    }
    //İşlemi sil
    public void sil(Long id){
        islemRepository.deleteById(id);
    }

    public Double toplamGelir(){
        return islemRepository.toplamTutar(IslemTuru.GELIR);
    }
    public Double toplamGider(){
        return islemRepository.toplamTutar(IslemTuru.GIDER);
    }
    public Double bakiye(){
        return toplamGelir() - toplamGider();
    }
    public Double kategoriToplami(Long kategoriId){
        return islemRepository.kategoriToplami(kategoriId);
    }

}
