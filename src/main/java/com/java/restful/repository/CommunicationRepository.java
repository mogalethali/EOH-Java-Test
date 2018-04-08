package com.java.restful.repository;

/**
 * Created by Thali on 2018/04/06.
 */
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.java.restful.entity.Communication;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface CommunicationRepository extends JpaRepository<Communication, Long> {

}