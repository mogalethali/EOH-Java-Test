package com.java.restful.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

/**
 * Created by Thali on 2018/04/06.
 */
@Entity
@Table(name = "Entify")
public class Enfity {

    //fields

    @Id
    @GeneratedValue
    private Long id;
    private String entifyName;
    private String emailAddress;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "enfity")
    private List<Communication> communication=new ArrayList<>();

    //method

    //constructor
    public Enfity() {

    }


    //properties


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntifyName() {
        return entifyName;
    }

    public void setEntifyName(String entifyName) {
        this.entifyName = entifyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public Iterable<Communication> getCommunication() {
        return Collections.unmodifiableList(communication);
    }

}
