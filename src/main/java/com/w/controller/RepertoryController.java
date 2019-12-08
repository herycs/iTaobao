package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.common.formatter.MyDateFormatter;
import com.w.domain.Repertory;
import com.w.service.RepertoryService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassNameRepertoryController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:08
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/reper")
public class RepertoryController {

    @Autowired
    private RepertoryService repertoryService;

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{reperID}", method = RequestMethod.POST)
    @ResponseBody
    public Result updateRepertory(@PathVariable("reperID") int reperID, @RequestBody Repertory repertory) throws Exception {
        repertory.setRepe_ID(reperID);
        repertory.setChange_time(new Date());
        int result = repertoryService.updateRepertory(repertory);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addRepertory(@RequestBody Repertory repertory) throws Exception {
        repertory.setChange_time(new Date());
        int result = repertoryService.addRepertory(repertory);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{reperID}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteRepertory(@PathVariable("reperID") int reperID) throws Exception {
        int result = repertoryService.deleteRepertory(reperID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List reperList = repertoryService.findAll();
        return new Result(StateCode.SUCCESS, "获取数据成功", reperList);
    }
}
