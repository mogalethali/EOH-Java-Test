package com.java.restful.controller;

/**
 * Created by Thali on 2018/04/06.
 */
import com.java.restful.repository.EntifyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.restful.entity.Enfity;
import com.java.restful.repository.EntifyRespository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/cic")
public class EntifyController {


    @Autowired
    private EntifyRespository repository;



    @GetMapping
    public Iterable<Enfity> listAll() {

        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Enfity find(@PathVariable(value = "id") Long entifyId) {
        return repository.findOne(entifyId);
    }

    @PostMapping(consumes = "application/json")
    public Enfity create(@RequestBody Enfity enfity) {

        return repository.save(enfity);
    }

    @DeleteMapping(path = "/{entifyId}")
    public void delete(@PathVariable("entifyId")Long entifyId) {
        repository.delete(entifyId);
    }


}