package com.w.dao;

import com.w.domain.Collect;
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
public interface CollectDao {

//    添加
    @Insert("insert into collect(userID,favourite_status) values(#{collect.userID},#{collect.favourite_status})")
    int addCollect(@Param("collect") Collect collect);

//    删除
    @Delete("delete from collect where collectID = #{collectID}")
    int deleteCollect(int collectID);

//    更新信息
    @Update("update collect set "+
                "userID = #{collect.userID}, "+
                "favourite_status = #{collect.favourite_status} "+
                "where collectID = #{collect.collectID}")
    int updateCollect(@Param("collect") Collect collect);

//    查询
    @Select("select * from Collect where collectID = #{collectID}")
    List<Collect> findCollectByID(int collectID);

    @Select("select * from collect")
    List<Collect> findAllCollect();

//    查询总数
    @Select("select count(*) from collect")
    int countCollectNum();
}
