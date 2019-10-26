package com.w.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassNamevalidateCode
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 21:27
 * @Version V1.0
 **/
@Controller
@RequestMapping("/code")
public class ValidateCode {

    @RequestMapping(value = "/validateCode")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        cn.dsna.util.images.ValidateCode vc = new cn.dsna.util.images.ValidateCode(110, 25, 4, 9);
        String code = vc.getCode();//得到生成的字符
        vc.write(response.getOutputStream());
        System.out.println(code);
        request.getSession().setAttribute("back_configcode",code);

    }
}
