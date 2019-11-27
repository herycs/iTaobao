package com.w.service.impl;

import com.w.dao.ProductDao;
import com.w.domain.Product;
import com.w.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public int addProduct(Product product){
        int result = productDao.addProduct(product);
        return result;
    }

    @Override
    public int deleteProduct(int productId){
        int result1 = productDao.deleteProduct(productId);
        return result1;
    }

    @Override
    public int updateProduct(Product product){
        int result2 = productDao.updateProduct(product);
        return result2;
    }

    @Override
    public List<Product> findProductByName(Product product){
        List<Product> productList = productDao.findProductByName(product);
        return productList;
    }

    @Override
    public  List<Product> findProductByID(Product product){
        List<Product> productList1 = productDao.findProductByID(product);
        return productList1;
    }

    @Override
    public List<Product> findAllProduct(){
        List<Product> productList2 = productDao.findAllProduct();
        return productList2;
    }

    @Override
    public int countProductNum(){
        return productDao.countProductNum();
    }

}
