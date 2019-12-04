package com.w.common.entity;

/**
 * @ClassNameStateCode
 * @Description
 * @Author ANGLE0
 * @Date2019/12/3 20:55
 * @Version V1.0
 **/
public class StateCode {
    public static final int SUCCESS = 0;
    public static final int FAILED = 20001;
    public static final int LOGINERROR =20002;//用户名或密码错误
    public static final int ACCESSERROR =20003;//权限不足
    public static final int REMOTEERROR =20004;//远程调用失败
    public static final int REPERROR =20005;//重复操作
}
