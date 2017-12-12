/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.entity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author PC06
 */
@Entity
@Table(name = "cv_1093")
public class cv_1093 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nim;
    @Column(length = 255, nullable = false)
    private String nama;
    @Column(length = 255, nullable = false)
    private String prodi;
    @OneToMany
    @JoinColumn(name="nim")
    private Set<nilai_1093> nilai_1093;

    /**
     * @return the nim
     */
    public Long getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(Long nim) {
        this.nim = nim;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the prodi
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the nilai_1093
     */
//    public nilai_1093 getNilai_1093() {
//        return nilai_1093;
//    }
//
//    /**
//     * @param nilai_1093 the nilai_1093 to set
//     */
//    public void setNilai_1093(nilai_1093 nilai_1093) {
//        this.nilai_1093 = nilai_1093;
//    }

   
}
