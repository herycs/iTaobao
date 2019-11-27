package com.w.controller.base;

import com.w.domain.Product;
import com.w.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameProductController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:07
 * @Version V1.0
 **/
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/update.do")
    public String updateProduct(Product product){
        int result = productService.updateProduct(product);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addProduct(Product product){
        int result = productService.addProduct(product);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteProduct(int productID){
        int result = productService.deleteProduct(productID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Product> findAll(){
        List productList = productService.findAllProduct();
        return productList;
    }
}
