package com.w.test.uml.factory;

import com.w.test.uml.ProductFactory;
import com.w.test.uml.entity.Surface;

/**
 * @ClassNamesurfaceFactory
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 9:19
 * @Version V1.0
 **/
public abstract class surfaceFactory extends ProductFactory {
    @Override
    protected abstract Surface createProduct();
}
