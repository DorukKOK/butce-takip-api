package com.example.butcetakipapi.repository;
import com.example.butcetakipapi.model.IslemTuru;
import com.example.butcetakipapi.model.Islem;
import com.example.butcetakipapi.model.KategoriOzetiDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IslemRepository extends JpaRepository<Islem,Long> {
    //Coalesce ->> sonuç null ise 0 kullan.
    @Query("SELECT COALESCE(SUM(i.tutar), 0) FROM Islem i WHERE i.islemTuru = :tur")
    Double toplamTutar(@Param("tur") IslemTuru tur);

    @Query("SELECT COALESCE(SUM(i.tutar), 0) FROM Islem i WHERE i.kategori.id = :kategoriId")
    Double kategoriToplami(@Param("kategoriId") Long kategoriId);

    @Query("SELECT i.kategori.ad, COALESCE(SUM(i.tutar), 0) FROM Islem i GROUP BY i.kategori.ad")
    List<KategoriOzetiDTO> kategoriOzeti();
}
