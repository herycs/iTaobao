package com.w.test.uml.init;

import com.w.test.uml.entity.Ipad;
import com.w.test.uml.factory.ipadFactory;

/**
 * @ClassNamehuaweiIpadFactory
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 9:34
 * @Version V1.0
 **/
public class huaweiIpadFactory extends ipadFactory {

    @Override
    protected Ipad createProduct() {
        Ipad ipad = new Ipad();
        ipad.setName("huawei");

        return ipad;
    }
}
