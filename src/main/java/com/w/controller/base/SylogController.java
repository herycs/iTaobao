package com.w.controller.base;

import com.w.dao.SyslogDao;
import com.w.domain.Syslog;
import com.w.service.SyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
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
@Controller
@RequestMapping("/syslog")
public class SylogController {

    @Autowired
    private SyslogService syslogService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Syslog> findAllSyslog(){
        List<Syslog> syslogList = null;
        syslogList = syslogService.findAll();
        return syslogList;
    }

    @RequestMapping("/del.do")
    public String delSyslog(int syslogID){
        int result = 0;
        result = syslogService.delSyslog(syslogID);
        return "result";
    }

    @RequestMapping("/add.do")
    public String addSyslog(Syslog syslog){
        int result = 0;
        result = syslogService.addSyslog(syslog);
        return "result";
    }
}
