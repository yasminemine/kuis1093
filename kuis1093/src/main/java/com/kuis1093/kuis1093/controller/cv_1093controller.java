/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1093.kuis1093.controller;
import java.util.List;
import com.kuis1093.kuis1093.entity.cv_1093;
import com.kuis1093.kuis1093.service.cv_1093service;
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
@RequestMapping("/cv_1093")
public class cv_1093controller {
     @Autowired
    private cv_1093service cv_1093Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1093 insert(@RequestBody cv_1093 cv_1093) {
        return cv_1093Service.insert(cv_1093);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1093 update(@RequestBody cv_1093 cv_1093) {
        return cv_1093Service.update(cv_1093);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1093Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1093 getById(@PathVariable("id") Long id){
        return cv_1093Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1093> getAll(){
        return cv_1093Service.getAll();
    }
}
