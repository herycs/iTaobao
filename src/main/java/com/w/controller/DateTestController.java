package com.w.controller;

import com.w.formatter.MyDateFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @ClassNameDateTest
 * @Description
 * @Author ANGLE0
 * @Date2019/10/28 17:26
 * @Version V1.0
 **/
@Controller
public class DateTestController {

    @Autowired
    private MyDateFormatter myDateFormatter;

    @RequestMapping("/convert.do")
    public String test1(String date, Model model){
        Date s = myDateFormatter.convert(date);
        System.out.println(s);
        model.addAttribute("date", s);
        return "ok";
    }
}
