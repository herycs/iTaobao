package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Credits;
import com.w.service.CreditsService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassNameCreditsController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:06
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/credit")
public class CreditsController {
    
    @Autowired
    private CreditsService creditsService;

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{creID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateCredits(@PathVariable("creID") int creID, @RequestBody Credits credits){
        credits.setCreditsID(creID);
        int result = creditsService.updateCredits(credits);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addCredits(@RequestBody Credits credits){
        int result = creditsService.addCredits(credits);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{creID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCredits(@PathVariable("creID") int creditsID){
        int result = creditsService.deleteCredits(creditsID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        List creditsList = creditsService.findAllCredits();
        return new Result(StateCode.SUCCESS, "获取数据成功", creditsList);
    }
}
