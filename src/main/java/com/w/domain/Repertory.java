package com.w.domain;

/**
 * @ClassNameRepertory
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:05
 * @Version V1.0
 **/

//create table repertory
//        (
//        repe_ID              int not null,
//        pro_ID               int,
//        repe_num             int,
//        primary key (repe_ID)
//        );

public class Repertory {

    Integer repe_ID;
    Integer pro_ID;
    Integer repe_num;

    public Integer getRepe_ID() {
        return repe_ID;
    }

    public void setRepe_ID(Integer repe_ID) {
        this.repe_ID = repe_ID;
    }

    public Integer getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(Integer pro_ID) {
        this.pro_ID = pro_ID;
    }

    public Integer getRepe_num() {
        return repe_num;
    }

    public void setRepe_num(Integer repe_num) {
        this.repe_num = repe_num;
    }
}
