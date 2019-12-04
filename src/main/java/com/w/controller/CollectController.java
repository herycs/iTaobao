package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Collect;
import com.w.service.CollectService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassNameCollectController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:06
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/coll")
public class CollectController {
    
    @Autowired
    private CollectService collectService;

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{collID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateColl(@PathVariable("collID")int collID, @RequestBody Collect collect){
        collect.setCollectID(collID);
        int result = collectService.updateCollect(collect);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addColl(@RequestBody Collect collect){
        int result = collectService.addCollect(collect);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{collectID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteColl(@PathVariable("collectID") int collectID){
        int result = collectService.deleteCollect(collectID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        List collectList = collectService.findAllCollect();
        return new Result(StateCode.SUCCESS, "数据获取成功", collectList);
    }
}
