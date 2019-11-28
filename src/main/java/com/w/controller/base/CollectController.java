package com.w.controller.base;

import com.w.domain.Collect;
import com.w.service.CollectService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateColl(Collect collect){
        int result = collectService.updateCollect(collect);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addColl(Collect collect){
        int result = collectService.addCollect(collect);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteColl(int collectID){
        int result = collectService.deleteCollect(collectID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List collectList = collectService.findAllCollect();
        return JsonData.getJsonData(new JsonData(0, "数据获取成功", collectList));
    }
}
