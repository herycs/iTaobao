package com.w.test.uml.entity;

import com.w.test.uml.Product;

/**
 * @ClassNamephone
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 9:00
 * @Version V1.0
 **/
public class Phone extends Product {
    private String name = "phone";
    public void play(){
        System.out.println("手机");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
