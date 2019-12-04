package com.w.test.uml.entity;

import com.w.test.uml.Product;

/**
 * @ClassNameipad
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 9:00
 * @Version V1.0
 **/
public class Ipad extends Product {
    private String name ="ipad";

    public void play(){
        System.out.println("ipad");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
