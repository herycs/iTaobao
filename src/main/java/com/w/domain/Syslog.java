package com.w.domain;

import java.util.Date;

/**
 * @ClassNamesyslog
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:07
 * @Version V1.0
 **/

//create table syslog
//        (
//        logID                int not null,
//        username             varchar(30),
//        visitTime            datetime,
//        ip                   varchar(50),
//        url                  varchar(200),
//        excutionTime         timestamp,
//        method               varchar(100),
//        primary key (logID)
//        );

public class Syslog {

    Integer logID;
    String username;
    Date visitTime;
    String ip;
    String url;
    Date excutionTime;
    String method;

    public Integer getLogID() {
        return logID;
    }

    public void setLogID(Integer logID) {
        this.logID = logID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getExcutionTime() {
        return excutionTime;
    }

    public void setExcutionTime(Date excutionTime) {
        this.excutionTime = excutionTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
