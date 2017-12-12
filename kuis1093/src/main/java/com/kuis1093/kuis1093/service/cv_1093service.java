/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.service;
import com.kuis1093.kuis1093.entity.cv_1093;
import com.kuis1093.kuis1093.repo.cv_1093repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC06
 */
@Service("cv_1093service")
@Transactional
public class cv_1093service {
    @Autowired
    private cv_1093repo repo;

    public cv_1093 insert(cv_1093 cv_1093) {
        return repo.save(cv_1093);
    }
    
    public cv_1093 update(cv_1093 cv_1093) {
        return repo.save(cv_1093);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1093 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1093> getAll(){
        return repo.findAllcv();
    }
    
    
}
