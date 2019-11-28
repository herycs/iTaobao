package com.w.domain;

import java.util.List;

/**
 * @ClassNameJsonData
 * @Description
 * @Author ANGLE0
 * @Date2019/11/28 9:03
 * @Version V1.0
 **/
public class JsonData {

    private Integer code;
    private String msg;
    private Integer count;
    private List<Object> data;

    public JsonData() {
    }

    public JsonData(Integer code, String msg, List<Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonData(Integer code, String msg, Integer count, List<Object> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static JsonData getUpdateSuccessData(){
        return new JsonData(0, "更新成功", null);
    }

    public static JsonData getDeleteSuccessData(){
        return new JsonData(0, "删除成功", null);
    }

    public static JsonData getAddSuccessData(){
        return new JsonData(0, "添加成功", null);
    }

    public static JsonData getUpdateFailedData(){
        return new JsonData(1, "更新失败", null);
    }

    public static JsonData getDeleteFailedData(){
        return new JsonData(1, "删除失败", null);
    }

    public static JsonData getAddFailedData(){
        return new JsonData(1, "添加失败", null);
    }

    public static JsonData getJsonData(JsonData jsonData) {
        return jsonData;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}