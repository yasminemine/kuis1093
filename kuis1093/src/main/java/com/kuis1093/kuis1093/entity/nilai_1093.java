/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author PC06
 */
@Entity
@Table(name = "nilai_1093")
public class nilai_1093 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kode_nilai;
    @Column(length = 255, nullable = false)
    private String nilai;
    @Column(length = 255, nullable = false)
    private String kategori;

    /**
     * @return the kode_nilai
     */
    public Long getKode_nilai() {
        return kode_nilai;
    }

    /**
     * @param kode_nilai the kode_nilai to set
     */
    public void setKode_nilai(Long kode_nilai) {
        this.kode_nilai = kode_nilai;
    }


    /**
     * @return the nilai
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}
