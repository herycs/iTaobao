package com.w.test;

import com.w.dao.ProductDao;
import com.w.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * @ClassNameProducttest
 * @Description
 * @Author ANGLE0
 * @Date2019/10/26 13:03
 * @Version V1.0
 **/
public class Producttest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void add() throws SQLException {

        Product product = new Product();
        product.setPro_name("鸡翅");
        product.setPro_Info("食品");

        System.out.println("创建产品："+product);
        System.out.println(product.toString());
        System.out.println("添加结果是："+productDao.addProduct(product));;

    }
}
