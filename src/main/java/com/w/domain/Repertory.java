package com.w.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

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
    Integer repe_num;//现库存数量
    Integer damage_num;//报损数量
    Integer increase_num;//本次入库数量
    Integer back_num;//退货数量
    @JsonFormat(locale = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date change_time;//修改时间
    Integer u_id;//修改人ID

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

    public Integer getDamage_num() {
        return damage_num;
    }

    public void setDamage_num(Integer damage_num) {
        this.damage_num = damage_num;
    }

    public Integer getIncrease_num() {
        return increase_num;
    }

    public void setIncrease_num(Integer increase_num) {
        this.increase_num = increase_num;
    }

    public Integer getBack_num() {
        return back_num;
    }

    public void setBack_num(Integer back_num) {
        this.back_num = back_num;
    }

    public Date getChange_time() {
        return change_time;
    }

    public void setChange_time(Date change_time) {
        this.change_time = change_time;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}
