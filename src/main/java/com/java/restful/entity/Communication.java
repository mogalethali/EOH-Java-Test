package com.java.restful.entity;
/**
 * Created by Thali on 2018/04/06.
 */
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Communication {

    //fields
    @Id
    @GeneratedValue
    private Long id;
    private String cicType;
    private String subject;
    private String body;
    private String sourceSystem;
    private Date cicTimeStamp;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "entifyId")
    private Enfity enfity;

    //Default constructor

    public Communication() {
    }


    //constructor
    public Communication(Enfity enfity,String cicType,String subject, String body, String sourceSystem, Date cicTimeStamp) {
        this.enfity = enfity;
        this.cicType=cicType;
        this.subject=subject;
        this.body=body;
        this.sourceSystem=sourceSystem;
        this.cicTimeStamp=cicTimeStamp;
    }


  //properties


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCicType() {
        return cicType;
    }

    public void setCicType(String cicType) {
        this.cicType = cicType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Date getCicTimeStamp() {
        return cicTimeStamp;
    }

    public void setCicTimeStamp(Date cicTimeStamp) {
        this.cicTimeStamp = cicTimeStamp;
    }


    public Enfity getEnfity() {
        return enfity;
    }

    public void setEnfity(Enfity enfity) {
        this.enfity = enfity;
    }
}