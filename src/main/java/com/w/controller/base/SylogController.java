package com.w.controller.base;

import com.w.domain.Syslog;
import com.w.service.SyslogService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAllSyslog(){
        List syslogList = syslogService.findAll();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", syslogList));
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData delSyslog(int syslogID){
        int result = 0;
        result = syslogService.delSyslog(syslogID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addSyslog(Syslog syslog){
        int result = 0;
        result = syslogService.addSyslog(syslog);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }
}
