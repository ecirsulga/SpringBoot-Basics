package com.ecirsulga.springboot.controller;

import com.ecirsulga.springboot.converter.KullaniciConverter;
import com.ecirsulga.springboot.dto.KullaniciDto;
import com.ecirsulga.springboot.entity.Kullanici;
import com.ecirsulga.springboot.service.entityservice.KullaniciEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/kullanicilar")
public class KullaniciController {

    @Autowired
    private KullaniciEntityService kullaniciEntityService;

    @GetMapping("")
    public List<Kullanici> findAll(){

        List<Kullanici> kullaniciList = kullaniciEntityService.findAll();

        return kullaniciList;
    }
    @GetMapping("/{id}")
    public Kullanici findById(@PathVariable Long id){

        Kullanici kullanici = kullaniciEntityService.findById(id);

        return kullanici;
    }

    @GetMapping("/byName/{userName}")
    public Kullanici findByUserName(@PathVariable String userName){

        Kullanici kullanici = kullaniciEntityService.findByUserName(userName);

        return kullanici;
    }

    @GetMapping("/byPhone/{userPhone}")
    public Kullanici findByUserPhone(@PathVariable String userPhone){

        Kullanici kullanici = kullaniciEntityService.findByUserPhone(userPhone);

        return kullanici;
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody KullaniciDto kullaniciDto){ //TODO: Input değeri dto tipinde olmalı

        Kullanici kullanici = KullaniciConverter.INSTANCE.convertKullaniciDtoToKullanici(kullaniciDto);

        kullanici = kullaniciEntityService.save(kullanici);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(kullanici.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }



}
