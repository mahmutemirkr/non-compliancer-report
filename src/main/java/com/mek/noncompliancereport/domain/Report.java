package com.mek.noncompliancereport.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private boolean musteriSikayeti;

    private boolean musteriUygunsuzluk;

    private boolean uretimUygunsuzluk;

    private boolean kaliteUygunsuzluk;

    private boolean argeUygunsuzluk;

    private boolean diger;

    private int siparisNumarasi;

    private int projeNumarasi;

    private int uygunsuzlukNumarasi;

    private int isEmriNumarasi;

    private int parcaNumarasi;

    private String uygunsuzlukTarihi;

    private int parcaRevizyonNumarasi;

    private int tezgahNumarasi;

    private int operasyonNumarasi;

    private int uretimAdedi;

    private int kabulAdet;

    private int uygunsuzAdet;

    private String personelBilgisi;

    private int seriNumarasi;

    private String  tesbitEdildigiBolum;

    private String musteriBilgisi;

    private String uygunsuzlukTanimi;






}
