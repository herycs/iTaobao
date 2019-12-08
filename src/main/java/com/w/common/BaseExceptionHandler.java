package com.w.common;

import com.alibaba.druid.support.spring.stat.annotation.Stat;
import com.w.common.entity.Result;
import com.w.common.entity.StateCode;
import org.apache.commons.fileupload.FileUploadBase;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.naming.SizeLimitExceededException;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerError(HttpServletRequest req, Exception e) {
        // MessageBean一个前后台交互的Json实体类，包括success，msg，data属性
        if (e instanceof  SizeLimitExceededException){
            return new Result(StateCode.FAILED, "文件大小超过限制");
        }
        if(e instanceof MaxUploadSizeExceededException){
            return new Result(StateCode.FAILED, "文件过大");
        }
        if(e instanceof ParseException){
            return new Result(StateCode.FAILED, "输入有误，格式转换失败");
        }
        System.out.println(e.getMessage());
        return new Result(StateCode.FAILED, "操作失败");
    }
}
