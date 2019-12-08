package com.w.service;

import com.w.domain.Product;

import java.util.List;

/**
 * @author ming
 */
public interface ProductService {
    public int addProduct(Product product) throws Exception;
    public int deleteProduct(int productId) throws Exception;
    public int updateProduct(Product product) throws Exception;
    public List<Product> findProductByName(Product product) throws Exception;
    public  List<Product> findProductByID(Product product) throws Exception;
    public List<Product> findAllProduct() throws Exception;
    public int countProductNum() throws Exception;
}
