package com.w.test.uml;

/**
 * @ClassNameProductFactory
 * @Description 主工厂
 * @Author ANGLE0
 * @Date2019/12/4 8:57
 * @Version V1.0
 **/
public abstract class ProductFactory<T> {
    protected abstract T createProduct();
}
