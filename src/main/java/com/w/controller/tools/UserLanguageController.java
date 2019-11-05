package com.w.controller.tools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * @ClassNameLanguage
 * @Description
 * @Author ANGLE0
 * @Date2019/10/28 21:09
 * @Version V1.0
 **/
@Controller
public class UserLanguageController {
    @RequestMapping("/changeLanguage.do")
    public String changeUserLanguage(Locale locale){
        return "ok";
    }
}
