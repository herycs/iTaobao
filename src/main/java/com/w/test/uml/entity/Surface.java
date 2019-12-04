package com.w.test.uml.entity;

import com.w.test.uml.Product;

/**
 * @ClassNamesurface
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 9:01
 * @Version V1.0
 **/
public class Surface extends Product{
    private String name = "surface";
    public void play(){
        System.out.println("surface");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
