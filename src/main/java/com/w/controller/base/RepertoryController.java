package com.w.controller.base;

import com.w.domain.Repertory;
import com.w.service.RepertoryService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateRepertory(Repertory repertory){
        int result = repertoryService.updateRepertory(repertory);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addRepertory(Repertory repertory){
        int result = repertoryService.addRepertory(repertory);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteRepertory(int RepertoryID){
        int result = repertoryService.deleteRepertory(RepertoryID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List reperList = repertoryService.findAll();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", reperList));
    }
}
