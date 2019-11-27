package com.w.controller.base;

import com.w.domain.Announcement;
import com.w.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameAnnocementController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 8:37
 * @Version V1.0
 **/
@Controller
@RequestMapping("/anno")
public class AnnocementController {

    @Autowired
    private AnnouncementService announcementService;

    @RequestMapping("/update.do")
    public String updateAnno(Announcement announcement){
        int result = announcementService.updateAnno(announcement);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addAnno(Announcement announcement){
        int result = announcementService.addAnno(announcement);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteAnno(String annu_ID){
        int result = announcementService.deleteAnno(annu_ID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Announcement> findAll(){
        List annoList = announcementService.findAll();
        return annoList;
    }
}
