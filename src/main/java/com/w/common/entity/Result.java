package com.w.common.entity;

import java.util.List;

/**
 * @ClassNameJsonData
 * @Description
 * @Author ANGLE0
 * @Date2019/11/28 9:03
 * @Version V1.0
 **/
public class Result {

    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static Result getUpdateSuccessData(){
        return new Result(StateCode.SUCCESS, "更新成功", null);
    }

    public static Result getDeleteSuccessData(){
        return new Result(StateCode.SUCCESS, "删除成功", null);
    }

    public static Result getAddSuccessData(){
        return new Result(StateCode.SUCCESS, "添加成功", null);
    }

    public static Result getUpdateFailedData(){
        return new Result(StateCode.FAILED, "更新失败", null);
    }

    public static Result getDeleteFailedData(){
        return new Result(StateCode.FAILED, "删除失败", null);
    }

    public static Result getAddFailedData(){
        return new Result(StateCode.FAILED, "添加失败", null);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}