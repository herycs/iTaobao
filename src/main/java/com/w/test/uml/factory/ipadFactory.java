package com.w.test.uml.factory;

import com.w.test.uml.ProductFactory;
import com.w.test.uml.entity.Ipad;

/**
 * @ClassNameipad
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 9:23
 * @Version V1.0
 **/
public abstract class ipadFactory extends ProductFactory {
    @Override
    protected abstract Ipad createProduct();
}
