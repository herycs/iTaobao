package com.w.controller;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.w.common.entity.Result;
import com.w.common.entity.StateCode;
import com.w.util.UuidUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @ClassNameFileUploadController
 * @Description
 * @Author ANGLE0
 * @Date2019/12/6 13:51
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/upload")
public class FileUploadController {

    private static final Log logger = LogFactory.getLog(FileUploadController.class);

    @RequestMapping(value = "/image", method = RequestMethod.POST)
    @ResponseBody
    public Result UploadImage(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile file) throws IOException {
        String imageLocation = uploadImage(request,  file);
        String msg = "";
        if (imageLocation != null && !imageLocation.equals("")){
            msg = "图片上传成功";
        }else {
            msg = "图片上传失败";
        }
        return new Result(StateCode.SUCCESS, msg, imageLocation);
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    @ResponseBody
    public Result UploadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile file) throws IOException {
        String fileLocation = uploadFile(request,  file);
        String msg = "";
        if (fileLocation != null && !fileLocation.equals("")){
            msg = "文件上传成功";
        }else {
            msg = "文件上传失败";
        }
        return new Result(StateCode.SUCCESS, msg, fileLocation);
    }

    public String uploadImage(HttpServletRequest request,  MultipartFile file) throws IOException {

        String folderName = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        ServletContext sc = request.getSession().getServletContext();
        String dir = sc.getRealPath("/upload/images/"+folderName);
        String type = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1, file.getOriginalFilename().length());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Random r = new Random();
        String imgName = "";
        if (type.equals("jpg") || type.equals("png")||type.equals("jpeg")) {
            imgName = sdf.format(new Date()) + r.nextInt(100) + "."+type;
        } else {
            logger.info("文件"+imgName+"类型不正确");
            return null;
        }
        FileUtils.writeByteArrayToFile(new File(dir, imgName), file.getBytes());
        logger.info("图片"+imgName+"上传成功");
        return "/upload/images/"+folderName+"/"+imgName;
    }

    public String uploadFile(HttpServletRequest request, MultipartFile file) throws IOException{
        //文件夹名
        String folderName = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        ServletContext sc = request.getSession().getServletContext();
        String dir = sc.getRealPath("/upload/files/"+folderName);
        String type = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1, file.getOriginalFilename().length());

        //文件名操作
        String newFileName = UuidUtil.getUuid()+"."+type;

        //创建新文件
        FileUtils.writeByteArrayToFile(new File(dir, newFileName), file.getBytes());
        logger.info(newFileName+"上传成功");
        return "/upload/file/"+folderName+"/"+newFileName;
    }
}
