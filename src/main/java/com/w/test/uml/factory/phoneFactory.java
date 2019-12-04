package com.w.test.uml.factory;

import com.w.test.uml.ProductFactory;
import com.w.test.uml.entity.Phone;

/**
 * @ClassNamephoneFactory
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 8:59
 * @Version V1.0
 **/
public abstract class phoneFactory extends ProductFactory {
    @Override
    protected abstract Phone createProduct();
}
