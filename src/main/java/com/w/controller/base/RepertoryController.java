package com.w.controller.base;

import com.w.domain.Repertory;
import com.w.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("/reper")
public class RepertoryController {

    @Autowired
    private RepertoryService repertoryService;

    @RequestMapping("/update.do")
    public String updateRepertory(Repertory repertory){
        int result = repertoryService.updateRepertory(repertory);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addRepertory(Repertory repertory){
        int result = repertoryService.addRepertory(repertory);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteRepertory(int RepertoryID){
        int result = repertoryService.deleteRepertory(RepertoryID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Repertory> findAll(){
        List reperList = repertoryService.findAll();
        return reperList;
    }
}
