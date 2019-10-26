package com.w.domain;

/**
 * @ClassNameHistory
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:03
 * @Version V1.0
 **/

//create table history
//        (
//        historyID            int not null,
//        userID               int,
//        historyData          varchar(200),
//        primary key (historyID)
//        );

public class History {

    Integer historyID;
    Integer userID;
    String historyData;

    public Integer getHistoryID() {
        return historyID;
    }

    public void setHistoryID(Integer historyID) {
        this.historyID = historyID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getHistoryData() {
        return historyData;
    }

    public void setHistoryData(String historyData) {
        this.historyData = historyData;
    }
}
