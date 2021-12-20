package com.ecirsulga.springboot.dao;

import com.ecirsulga.springboot.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KategoriDao extends JpaRepository<Kategori, Long> {

    List<Kategori> findAllByUstKategoriIsNullOrderByAdiDesc();

    List<Kategori> findAllByAdiEndsWith(String adi);

}