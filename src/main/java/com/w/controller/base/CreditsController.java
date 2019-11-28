package com.w.controller.base;

import com.w.domain.Credits;
import com.w.service.CreditsService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateCredits(Credits credits){
        int result = creditsService.updateCredits(credits);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addCredits(Credits credits){
        int result = creditsService.addCredits(credits);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteCredits(String creditsID){
        int result = creditsService.deleteCredits(creditsID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List creditsList = creditsService.findAllCredits();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", creditsList));
    }
}
