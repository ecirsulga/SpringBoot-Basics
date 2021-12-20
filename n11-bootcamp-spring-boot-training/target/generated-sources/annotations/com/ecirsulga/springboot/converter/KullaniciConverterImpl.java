package com.ecirsulga.springboot.converter;

import com.ecirsulga.springboot.dto.KullaniciDto;
import com.ecirsulga.springboot.entity.Kullanici;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-21T00:32:40+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
public class KullaniciConverterImpl implements KullaniciConverter {

    @Override
    public KullaniciDto convertKullaniciToKullaniciDto(Kullanici kullanici) {
        if ( kullanici == null ) {
            return null;
        }

        KullaniciDto kullaniciDto = new KullaniciDto();

        kullaniciDto.setId( kullanici.getId() );
        kullaniciDto.setAdi( kullanici.getAdi() );
        kullaniciDto.setSoyadi( kullanici.getSoyadi() );
        kullaniciDto.setEmail( kullanici.getEmail() );
        kullaniciDto.setTelefon( kullanici.getTelefon() );
        kullaniciDto.setKullaniciAdi( kullanici.getKullaniciAdi() );

        return kullaniciDto;
    }

    @Override
    public Kullanici convertKullaniciDtoToKullanici(KullaniciDto kullaniciDto) {
        if ( kullaniciDto == null ) {
            return null;
        }

        Kullanici kullanici = new Kullanici();

        kullanici.setSoyadi( kullaniciDto.getSoyadi() );
        kullanici.setTelefon( kullaniciDto.getTelefon() );
        kullanici.setId( kullaniciDto.getId() );
        kullanici.setAdi( kullaniciDto.getAdi() );
        kullanici.setEmail( kullaniciDto.getEmail() );
        kullanici.setKullaniciAdi( kullaniciDto.getKullaniciAdi() );

        return kullanici;
    }
}
