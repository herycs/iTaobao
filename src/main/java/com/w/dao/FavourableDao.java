package com.w.dao;

import com.w.domain.Favourable;
import org.apache.ibatis.annotations.*;
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
public interface FavourableDao {

//    添加商品
    @Insert("insert into " +
                "favourable(pro_ID,fav_name,fav_price,fav_method) "+
                    " values(" +
                    "#{favourable.pro_ID}," +
                    "#{favourable.fav_name}," +
                    "#{favourable.fav_price},"+
                    "#{favourable.fav_method}" +
                    ")")
    int addFavourable(@Param("favourable") Favourable favourable);

//    删除商品
    @Delete("delete from favourable where fav_ID = #{fav_ID}")
    int deleteFavourable(int fav_ID);

//    更新商品信息
    @Update("update favourable set "+
                "pro_ID = #{favourable.pro_ID}, "+
                "fav_name = #{favourable.fav_name}, "+
                "fav_price = #{favourable.fav_price}, "+
                "fav_method = #{favourable.fav_method} "+
                "where fav_ID = #{favourable.fav_ID}")
    int updateFavourable(@Param("favourable") Favourable favourable);

//    查询产品
    @Select("select * from favourable where fav_name = #{fav_name}")
    List<Favourable> findFavourableByName(String fav_name);

    @Select("select * from favourable where fav_ID = #{favourableID}")
    List<Favourable> findFavourableByID(int favourableID);

    @Select("select * from favourable")
    List<Favourable> findAllFavourable();

//    查询总数
    @Select("select count(*) from favourable")
    int countFavourableNum();
}
