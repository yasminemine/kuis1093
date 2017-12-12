/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.repo;
import com.kuis1093.kuis1093.entity.cv_1093;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC06
 */
public interface cv_1093repo extends CrudRepository<cv_1093, Long> {
    @Query("select * from cv_1093")
    public List<cv_1093> findAllcv();
    
}
