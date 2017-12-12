/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.controller;
import java.util.List;
import com.kuis1093.kuis1093.entity.nilai_1093;
import com.kuis1093.kuis1093.service.nilai_1093service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC06
 */
@RestController
@RequestMapping("/nilai_1093")
public class nilai_1093controller {
    
     @Autowired
    private nilai_1093service nilai_1093Service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1093 insert(@RequestBody nilai_1093 nilai_1093) {
        return nilai_1093Service.insert(nilai_1093);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1093 update(@RequestBody nilai_1093 nilai_1093) {
        return nilai_1093Service.update(nilai_1093);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return nilai_1093Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public nilai_1093 getById(@PathVariable("id") Long id){
        return nilai_1093Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<nilai_1093> getAll(){
        return nilai_1093Service.getAll();
    }
}
