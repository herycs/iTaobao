package com.w.controller;

import com.w.domain.FilePOJO;
import com.w.util.UuidUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


/**
 * @ClassNameFileUploadTest
 * @Description
 * @Author ANGLE0
 * @Date2019/10/29 14:39
 * @Version V1.0
 **/
@Controller
public class FileUploadTest {

    //记录日志的对象
    private static final Log logger = LogFactory.getLog(FileUploadTest.class);

    @RequestMapping("/upload.do")
    public String UploadFile(@ModelAttribute("file") FilePOJO filePOJO, HttpServletRequest request) throws IOException {
        String path = request.getServletContext().getRealPath("uploads");

        //文件名操作
        String newFileName = "";
        String fileName = filePOJO.getFile().getOriginalFilename();

        if (fileName.length()>0) {

            //设置文件描述,为文件名创建做基础
            String fileOriginal = fileName.substring(0,fileName.lastIndexOf('.'));
            String desc = filePOJO.getDesc();
            //自定义了名称则用自定义的名称，否则用原文件名
            filePOJO.setDesc(!desc.equals("") ?  desc:fileOriginal);

            //裁剪文件类型
            String fileType = fileName.substring(fileName.lastIndexOf('.'));

            //创建新文件名
            newFileName = UuidUtil.getUuid()+'-'+filePOJO.getDesc()+fileType;
            File targetFile = new File(path, newFileName);
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }

            //上传
            filePOJO.getFile().transferTo(targetFile);
            logger.info("文件："+fileName+"上传成功");
        }else{
            System.out.println("文件名认证不通过");
            request.setAttribute("file", "success");
            logger.info("文件："+fileName+"上传失败");
        }
        return "ok";
    }
}
