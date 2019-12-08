package com.w.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @ClassNameAnnouncement
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:01
 * @Version V1.0
 **/

//create table announcement
//        (
//        annu_ID              int not null auto_increment,
//        annu_title           varchar(50),
//        annu_image           varchar(100),
//        annu_content         varchar(100),
//        annu_time            datetime,
//        annu_type            char(3),
//        annu_preTime         datetime,
//        annu_isTop           char(1),
//        annu_state           char(1),
//        primary key (annu_ID)
//        );
@Repository
public class Announcement {

    @Id
    private Integer annu_ID;
    private String annu_title;
    private String annu_image;
    private String annu_content;
    @JsonFormat(locale = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date annu_time;
    private Integer annu_type;
    @JsonFormat(locale = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date annu_preTime;
    private Integer annu_isTop;
    private Integer annu_state;

    public Integer getAnnu_ID() {
        return annu_ID;
    }

    public void setAnnu_ID(Integer annu_ID) {
        this.annu_ID = annu_ID;
    }

    public String getAnnu_title() {
        return annu_title;
    }

    public void setAnnu_title(String annu_title) {
        this.annu_title = annu_title;
    }

    public String getAnnu_image() {
        return annu_image;
    }

    public void setAnnu_image(String annu_image) {
        this.annu_image = annu_image;
    }

    public String getAnnu_content() {
        return annu_content;
    }

    public void setAnnu_content(String annu_content) {
        this.annu_content = annu_content;
    }

    public Date getAnnu_time() {
        return annu_time;
    }

    public void setAnnu_time(Date annu_time) {
        this.annu_time = annu_time;
    }

    public Integer getAnnu_type() {
        return annu_type;
    }

    public void setAnnu_type(Integer annu_type) {
        this.annu_type = annu_type;
    }

    public Date getAnnu_preTime() {
        return annu_preTime;
    }

    public void setAnnu_preTime(Date annu_preTime) {
        this.annu_preTime = annu_preTime;
    }

    public Integer getAnnu_isTop() {
        return annu_isTop;
    }

    public void setAnnu_isTop(Integer annu_isTop) {
        this.annu_isTop = annu_isTop;
    }

    public Integer getAnnu_state() {
        return annu_state;
    }

    public void setAnnu_state(Integer annu_state) {
        this.annu_state = annu_state;
    }
}
