package com.w.domain;

/**
 * @ClassNameAnnouncement
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:01
 * @Version V1.0
 **/

//create table announcement
//        (
//        annu_ID              int not null,
//        annu_data            varchar(100),
//        primary key (annu_ID)
//        );

public class Announcement {

    Integer annu_ID;
    String annu_data;

    public Integer getAnnu_ID() {
        return annu_ID;
    }

    public void setAnnu_ID(Integer annu_ID) {
        this.annu_ID = annu_ID;
    }

    public String getAnnu_data() {
        return annu_data;
    }

    public void setAnnu_data(String annu_data) {
        this.annu_data = annu_data;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "annu_ID=" + annu_ID +
                ", annu_data='" + annu_data + '\'' +
                '}';
    }
}
