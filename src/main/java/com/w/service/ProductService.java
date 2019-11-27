package com.w.service;

import com.w.domain.Product;

import java.util.List;

/**
 * @author ming
 */
public interface ProductService {
    public int addProduct(Product product);
    public int deleteProduct(int productId);
    public int updateProduct(Product product);
    public List<Product> findProductByName(Product product);
    public  List<Product> findProductByID(Product product);
    public List<Product> findAllProduct();
    public int countProductNum();
}
