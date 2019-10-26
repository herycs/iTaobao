package com.w.domain;

/**
 * @ClassNameCredits
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:02
 * @Version V1.0
 **/

//create table credits
//        (
//        creditsID            int not null,
//        userID               int,
//        credits              int,
//        primary key (creditsID)
//        );

public class Credits {

    Integer creditsID;
    Integer userID;
    Integer credits;

    public Integer getCreditsID() {
        return creditsID;
    }

    public void setCreditsID(Integer creditsID) {
        this.creditsID = creditsID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
}
