/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.service;
import com.kuis1093.kuis1093.entity.nilai_1093;
import com.kuis1093.kuis1093.repo.nilai_1093repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC06
 */
@Service("nilai_1093service")
@Transactional
public class nilai_1093service {
    @Autowired
    private nilai_1093repo repo;

    public nilai_1093 insert(nilai_1093 nilai_1093) {
        return repo.save(nilai_1093);
    }
    
    public nilai_1093 update(nilai_1093 nilai_1093) {
        return repo.save(nilai_1093);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public nilai_1093 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<nilai_1093> getAll(){
        return repo.findAllnilai();
    }
}
