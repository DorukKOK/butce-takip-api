package com.example.butcetakipapi.repository;
import com.example.butcetakipapi.model.IslemTuru;
import com.example.butcetakipapi.model.Islem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IslemRepository extends JpaRepository<Islem,Long> {
    //Coalesce ->> sonuç null ise 0 kullan.
    @Query("SELECT COALESCE(SUM(i.tutar), 0) FROM Islem i WHERE i.islemTuru = :tur")
    Double toplamTutar(@Param("tur") IslemTuru tur);
}
