package com.w.domain;

/**
 * @ClassNameBusiness
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:17
 * @Version V1.0
 **/

//create table business
//        (
//        bus_ID               int not null,
//        bus_detail_ID        int,
//        bus_Name             varchar(20),
//        bus_address          varchar(50),
//        bus_phone            varchar(20),
//        bus_email            varchar(30),
//        bus_people           varchar(20),
//        primary key (bus_ID)
//        );

public class Business {
    Integer bus_ID;
    Integer bus_detail_ID;
    String bus_Name;
    String bus_address;
    String bus_phone;
    String bus_email;
    String bus_people;

    public Integer getBus_ID() {
        return bus_ID;
    }

    public void setBus_ID(Integer bus_ID) {
        this.bus_ID = bus_ID;
    }

    public Integer getBus_detail_ID() {
        return bus_detail_ID;
    }

    public void setBus_detail_ID(Integer bus_detail_ID) {
        this.bus_detail_ID = bus_detail_ID;
    }

    public String getBus_Name() {
        return bus_Name;
    }

    public void setBus_Name(String bus_Name) {
        this.bus_Name = bus_Name;
    }

    public String getBus_address() {
        return bus_address;
    }

    public void setBus_address(String bus_address) {
        this.bus_address = bus_address;
    }

    public String getBus_phone() {
        return bus_phone;
    }

    public void setBus_phone(String bus_phone) {
        this.bus_phone = bus_phone;
    }

    public String getBus_email() {
        return bus_email;
    }

    public void setBus_email(String bus_email) {
        this.bus_email = bus_email;
    }

    public String getBus_people() {
        return bus_people;
    }

    public void setBus_people(String bus_people) {
        this.bus_people = bus_people;
    }
}
