package com.w.dao;

import com.w.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassNameProductDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/26 12:35
 * @Version V1.0
 **/
@Repository
public interface ProductDao {

//    添加商品
    @Insert("insert into product(pro_name, pro_img, pro_price, pro_Info, pro_explain, pro_status)" +
            " values(" +
            "#{product.pro_name}" +
            ", #{product.pro_img}" +
            ", #{product.pro_price}" +
            ", #{product.pro_Info}" +
            ", #{product.pro_explain}" +
            ", #{product.pro_status}" +
            ")")
    int addProduct(@Param("product") Product product) throws SQLException;

//    删除商品
    @Delete("delete from product where pro_ID = #{productID}")
    int deleteProduct(int productId) throws SQLException;

//    更新商品信息
    @Update("update product set " +
            "pro_name = #{product.pro_name},"+
            "pro_img = #{product.pro_img}," +
            "pro_price = #{product.pro_price}," +
            "pro_Info = #{product.pro_Info}," +
            "pro_explain = #{product.pro_explain}," +
            "pro_status = #{product.pro_status}" +
            " where pro_ID = #{product.pro_ID}")
    int updateProduct(@Param("product") Product product) throws SQLException;

//    查询产品
    @Select("select * from product where product_name = #{product.product_name}")
    List<Product> findProductByName(Product product) throws SQLException;

    @Select("select * from product where productID = #{product.productID}")
    List<Product> findProductByID(Product product) throws SQLException;

    @Select("select * from product")
    List<Product> findAllProduct() throws SQLException;

//    查询商品总数
    @Select("select count(*) from product")
    int countProductNum() throws SQLException;
}
