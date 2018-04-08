package com.java.restful.repository;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.java.restful.entity.Enfity;
import org.springframework.data.rest.core.annotation.RestResource;



/**
 * Created by Thali on 2018/04/07.
 */
@RestResource(exported = false)
public interface EntifyRespository extends JpaRepository <Enfity, Long> {




}
