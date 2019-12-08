package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Announcement;
import com.w.service.AnnouncementService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping(value = "/anno")
public class AnnocementController {

    @Autowired
    private AnnouncementService announcementService;

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{annoID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateAnno(@PathVariable("annoID") int annoID, @RequestBody Announcement announcement) throws Exception {
        announcement.setAnnu_ID(annoID);
        int result = announcementService.updateAnno(announcement);
        if (result == 1) {
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addAnno(@RequestBody Announcement announcement) throws Exception {
        int result = announcementService.addAnno(announcement);
        if (result == 1) {
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }


//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{annuID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteAnno(@PathVariable("annuID") int annuID) throws Exception {
        int code = -1;
        int result = announcementService.deleteAnno(annuID);
        if (result == 1) {
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List annoList = announcementService.findAll();
        return new Result(StateCode.SUCCESS, "获取数据成功", annoList);
    }

//    @RequestMapping("/findOne.do")
    @RequestMapping(value = "/{annuID}", method = RequestMethod.GET)
    @ResponseBody
    public Result findByID(@PathVariable("annuID") int annuID) throws Exception {
        List announcement = announcementService.findOneByID(annuID);
        return new Result(StateCode.SUCCESS, "查找成功",announcement);
    }
}
