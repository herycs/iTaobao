package com.w.controller.base;

import com.w.domain.Collect;
import com.w.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("/coll")
public class CollectController {
    
    @Autowired
    private CollectService collectService;

    @RequestMapping("/update.do")
    public String updateColl(Collect collect){
        int result = collectService.updateCollect(collect);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addColl(Collect collect){
        int result = collectService.addCollect(collect);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteColl(int collectID){
        int result = collectService.deleteCollect(collectID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Collect> findAll(){
        List collectList = collectService.findAllCollect();
        return collectList;
    }
}
