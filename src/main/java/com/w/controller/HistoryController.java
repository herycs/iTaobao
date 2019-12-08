package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.History;
import com.w.service.HistoryService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{hisID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateHistory(@PathVariable("hisID") int hisID, @RequestBody History history) throws Exception {
        history.setHistoryID(hisID);
        int result = historyService.updateHistory(history);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addHistory(@RequestBody History history) throws Exception {
        int result = historyService.addHistory(history);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{hisID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteHistory(@PathVariable("hisID") int hisID) throws Exception {
        int result = historyService.deleteHistory(hisID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List historyList = historyService.findAllHistory();
        return new Result(StateCode.SUCCESS, "获取数据成功", historyList);
    }
}
