package com.w.controller.base;

import com.w.domain.Credits;
import com.w.service.CreditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("/credit")
public class CreditsController {
    
    @Autowired
    private CreditsService creditsService;

    @RequestMapping("/update.do")
    public String updateCredits(Credits credits){
        int result = creditsService.updateCredits(credits);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addCredits(Credits credits){
        int result = creditsService.addCredits(credits);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteCredits(String creditsID){
        int result = creditsService.deleteCredits(creditsID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Credits> findAll(){
        List creditsList = creditsService.findAllCredits();
        return creditsList;
    }
}
