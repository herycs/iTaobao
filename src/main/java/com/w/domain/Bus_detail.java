package com.w.domain;

/**
 * @ClassNameBus_detail
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:02
 * @Version V1.0
 **/

//create table bus_detail
//        (
//        bus_detail_ID        int not null,
//        identfify_face       varchar(50),
//        identfify_back       varchar(50),
//        primary key (bus_detail_ID)
//        );

public class Bus_detail {
    Integer bus_detail_ID;
    String identfify_face;
    String identfify_back;

    public Integer getBus_detail_ID() {
        return bus_detail_ID;
    }

    public void setBus_detail_ID(Integer bus_detail_ID) {
        this.bus_detail_ID = bus_detail_ID;
    }

    public String getIdentfify_face() {
        return identfify_face;
    }

    public void setIdentfify_face(String identfify_face) {
        this.identfify_face = identfify_face;
    }

    public String getIdentfify_back() {
        return identfify_back;
    }

    public void setIdentfify_back(String identfify_back) {
        this.identfify_back = identfify_back;
    }
}
