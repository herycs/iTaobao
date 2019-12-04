package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Syslog;
import com.w.service.SyslogService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameSylogController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:08
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/syslog")
public class SylogController {

    @Autowired
    private SyslogService syslogService;

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAllSyslog(){
        List syslogList = syslogService.findAll();
        return new Result(StateCode.SUCCESS , "获取数据成功", syslogList);
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{sysID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result delSyslog(@PathVariable("sysID") int sysID){
        int result = 0;
        result = syslogService.delSyslog(sysID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

    @RequestMapping(value = "/all",method = RequestMethod.DELETE)
    @ResponseBody
    public Result delAllSyslog(@RequestBody List<Integer> list){
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = syslogService.delSyslog(list.get(i));
        }
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addSyslog( @RequestBody Syslog syslog){
        int result = 0;
        result = syslogService.addSyslog(syslog);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }
}
