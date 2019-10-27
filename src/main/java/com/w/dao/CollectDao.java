package com.w.dao;

import com.w.domain.Collect;
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
public interface CollectDao {

//    添加
    @Insert("insert into collect(userID,favourite_status) values(#{Collect.userID},#{Collect.favourite_status})")
    int addCollect(Collect collect);

//    删除
    @Delete("delete from collect where collectID = #{collectID}")
    int deleteCollect(String collectID);

//    更新信息
    @Update("update collect set "+
                "userID = #{collect.userID}, "+
                "cate_name = #{collect.favourite_status} "+
                "where collectID = #{collect.collectID}")
    int updateCollect(Collect collect);

//    查询
    @Select("select * from Collect where collectID = #{collectID}")
    List<Collect> findCollectByID(String collectID);

    @Select("select * from collect")
    List<Collect> findAllCollect();

//    查询总数
    @Select("select count(*) from collect")
    int countCollectNum();
}
