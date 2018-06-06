package com.example.demo.mapper.model;

import java.util.Date;

public class MqClusterInst {
    private Long id;

    private String clusterName;

    private Date crtTime;

    private String clusterUser;

    private String tanantid;

    private String deployResource;

    private String tanantname;

    private String type;

    private String state;

    private String clusterInst;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getClusterUser() {
        return clusterUser;
    }

    public void setClusterUser(String clusterUser) {
        this.clusterUser = clusterUser;
    }

    public String getTanantid() {
        return tanantid;
    }

    public void setTanantid(String tanantid) {
        this.tanantid = tanantid;
    }

    public String getDeployResource() {
        return deployResource;
    }

    public void setDeployResource(String deployResource) {
        this.deployResource = deployResource;
    }

    public String getTanantname() {
        return tanantname;
    }

    public void setTanantname(String tanantname) {
        this.tanantname = tanantname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getClusterInst() {
        return clusterInst;
    }

    public void setClusterInst(String clusterInst) {
        this.clusterInst = clusterInst;
    }
}