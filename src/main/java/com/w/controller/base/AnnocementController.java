package com.w.controller.base;

import com.w.domain.Announcement;
import com.w.service.AnnouncementService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameAnnocementController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 8:37
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/anno")
public class AnnocementController {

    @Autowired
    private AnnouncementService announcementService;

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateAnno(Announcement announcement){
        int result = announcementService.updateAnno(announcement);
        if (result == 1) {
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addAnno(Announcement announcement){
        int result = announcementService.addAnno(announcement);
        if (result == 1) {
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteAnno(String annu_ID){
        int code = -1;
        int result = announcementService.deleteAnno(annu_ID);
        if (result == 1) {
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List annoList = announcementService.findAll();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", annoList));
    }
}
