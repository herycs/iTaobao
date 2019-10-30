package com.w.domain;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassNameFilePOJO
 * @Description
 * @Author ANGLE0
 * @Date2019/10/29 14:38
 * @Version V1.0
 **/
public class FilePOJO {

    private MultipartFile file;
    private String desc;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
