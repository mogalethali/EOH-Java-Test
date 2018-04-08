package com.java.restful.controller;

/**
 * Created by Thali on 2018/04/06.
 */
import com.java.restful.entity.Enfity;
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

import com.java.restful.entity.Communication;
import com.java.restful.repository.CommunicationRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/cic/{entifyId}/cic")
public class CommunicationController {

    @Autowired
    private CommunicationRepository communicationRepository;

    @Autowired
    private EntifyRespository entifyRepository;



    @GetMapping
    public Iterable<Communication> findAll() {
        return communicationRepository.findAll();
    }




    @GetMapping(path = "/{id}")
    public Communication find(@PathVariable(value = "id") Long cicId) {
        return communicationRepository.findOne(cicId);
    }

    @PostMapping(consumes = "application/json")
    public Communication create(@PathVariable long entifyId, @RequestBody Communication newCommunication) {

        Enfity entify = entifyRepository.findOne(entifyId);
        Communication communication = new Communication(entify,newCommunication.getCicType(),newCommunication.getSubject(),newCommunication.getBody(),newCommunication.getSourceSystem(),newCommunication.getCicTimeStamp());

        return communicationRepository.save(communication);
    }

    @DeleteMapping(path = "/{cicId}")
    public void delete(@PathVariable("cicId")Long cicId) {
        communicationRepository.delete(cicId);
    }



}