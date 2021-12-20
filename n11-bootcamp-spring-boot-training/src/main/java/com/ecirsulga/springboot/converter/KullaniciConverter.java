package com.ecirsulga.springboot.converter;

import com.ecirsulga.springboot.dto.KullaniciDto;
import com.ecirsulga.springboot.entity.Kullanici;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KullaniciConverter {

    KullaniciConverter INSTANCE = Mappers.getMapper(KullaniciConverter.class);

    KullaniciDto convertKullaniciToKullaniciDto(Kullanici kullanici);

    @Mapping(source = "soyadi", target = "soyadi")
    @Mapping(source = "telefon", target = "telefon")
    Kullanici convertKullaniciDtoToKullanici(KullaniciDto kullaniciDto);

}
