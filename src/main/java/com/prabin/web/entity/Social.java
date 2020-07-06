/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prabin.web.entity;

import com.prabin.web.core.MasterEntity;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author apple
 */
@Table(name = "mst_social_medias")
@MappedSuperclass
public class Social extends MasterEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "status")
    private boolean status;

    public Social() {
    }
    
    public Social(int id) {
        this.id=id;
    }

    public Social(int id,String name, String code, boolean status) {
        this.id=id;
        this.name = name;
        this.code = code;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}