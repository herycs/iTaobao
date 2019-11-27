package com.w.controller.base;

import com.w.domain.History;
import com.w.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.ssl.HandshakeInStream;

import java.util.List;

/**
 * @ClassNameHistoryController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:06
 * @Version V1.0
 **/
@Controller
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/update.do")
    public String updateHistory(History history){
        int result = historyService.updateHistory(history);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addHistory(History history){
        int result = historyService.addHistory(history);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteHistory(String historyID){
        int result = historyService.deleteHistory(historyID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<History> findAll(){
        List historyList = historyService.findAllHistory();
        return historyList;
    }
}
