package com.w.dao;

import com.w.domain.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassNameProductDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/26 12:35
 * @Version V1.0
 **/
@Repository
public interface CategoryDao {

//    添加
    @Insert("insert into category(pro_ID,cate_name) values(#{category.pro_ID},#{category.cate_name})")
    int addCategory(Category category);

//    删除
    @Delete("delete from category where cate_ID = #{categoryID}")
    int deleteCategory(String categoryID);

//    更新信息
    @Update("update category set "+
                "pro_ID = #{category.pro_ID}, "+
                "cate_name = #{category.cate_name} "+
                "where cate_ID = #{category.cate_ID}")
    int updateCategory(Category category);

//    查询
    @Select("select * from Category where cate_name = #{cate_name}")
    List<Category> findCategoryByName(String cate_name);

    @Select("select * from Category where annu_ID = #{CategoryID}")
    List<Category> findCategoryByID(String CategoryID);

    @Select("select * from Category")
    List<Category> findAllCategory();

//    查询总数
    @Select("select count(*) from Category")
    int countCategoryNum();
}
