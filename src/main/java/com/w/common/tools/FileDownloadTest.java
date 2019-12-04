package com.w.common.tools;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.w.domain.FilePOJO;
import com.w.util.UuidUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;

/**
 * @ClassNameFileDownloadController
 * @Description
 * @Author ANGLE0
 * @Date2019/10/29 15:35
 * @Version V1.0
 **/
@Controller
public class FileDownloadTest {

    private static final Log logger = LogFactory.getLog(FileDownloadTest.class);

    public class FileNames{
        public String name;
        public String realName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }
    }

    //显示下载文件
    @RequestMapping("/showFiles.do")
    public String showFiles(HttpServletRequest request, Model model){

        FileNames fileNames = new FileNames();
        String path = request.getServletContext().getRealPath("uploads");
        File dir = new File(path);
        File files[] = dir.listFiles();

        ArrayList<FileNames> fileNameList = new ArrayList<>();

        if(files != null){
            for (int i = 0; i < files.length; i++) {
                fileNames.setRealName(files[i].getName());
                fileNames.setName(files[i].getName().substring(files[i].getName().indexOf('-')+1));
                fileNameList.add(fileNames);
            }
        }else{
            fileNameList = null;
        }
        model.addAttribute("files", fileNameList);
        return "filelist";
    }

    @RequestMapping("/downFiles.do")
    public String down(@RequestParam String filename, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = null;
        FileInputStream in = null;
        ServletOutputStream outputStream = null;
        //剪切下载文件名
        String name = filename.substring(filename.lastIndexOf('-')+1);

        path = request.getServletContext().getRealPath("uploads");

        response.setHeader("Content-Type", "application/x-msdownload");
        response.setHeader("Content-Disposition", "attachment;filename="+toUTF8String(name));

        in = new FileInputStream(path+"\\"+filename);
        outputStream = response.getOutputStream();
        outputStream.flush();;
        int len = 0;
        byte bytes[] = new byte[1024];
        while ((len = in.read(bytes))!= -1 && in != null) {
            outputStream.write(bytes, 0, len);
        }
        outputStream.flush();
        in.close();
        outputStream.close();

        logger.info("文件"+filename+"下载成功");
        return null;
    }
    //字符转码
    private String toUTF8String(String str) {
       StringBuffer stringBuffer = new StringBuffer();
       int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c >= 0 && c <= 255){
                stringBuffer.append(c);
            }else {
                byte b[];
                try {
                    b = Character.toString(c).getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    b = null;
                }
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) {
                        k &= 255;
                    }
                    stringBuffer.append("%"+Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return stringBuffer.toString();
    }

    /**
     * @ClassNameFileUploadTest
     * @Description
     * @Author ANGLE0
     * @Date2019/10/29 14:39
     * @Version V1.0
     **/
    @Controller
    public static class FileUploadTest {

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
}
