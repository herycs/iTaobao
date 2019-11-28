package com.w.controller.base;

import com.w.domain.History;
import com.w.service.HistoryService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameHistoryController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:06
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateHistory(History history){
        int result = historyService.updateHistory(history);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addHistory(History history){
        int result = historyService.addHistory(history);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteHistory(String historyID){
        int result = historyService.deleteHistory(historyID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List historyList = historyService.findAllHistory();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", historyList));
    }
}
