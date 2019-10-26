package com.w.domain;

/**
 * @ClassNameCollect
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:02
 * @Version V1.0
 **/

//create table collect
//        (
//        collectID            int not null,
//        userID               int,
//        favourite_status     char(1) comment '1表示收藏
//        0表示未收藏',
//        primary key (collectID)
//        );

public class Collect {

    Integer collectID;
    Integer userID;
    Integer favourite_status;

    public Integer getCollectID() {
        return collectID;
    }

    public void setCollectID(Integer collectID) {
        this.collectID = collectID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getFavourite_status() {
        return favourite_status;
    }

    public void setFavourite_status(Integer favourite_status) {
        this.favourite_status = favourite_status;
    }
}
