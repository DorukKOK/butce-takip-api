package com.example.butcetakipapi.repository;

import com.example.butcetakipapi.model.Islem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IslemRepository extends JpaRepository<Islem,Long> {
}
