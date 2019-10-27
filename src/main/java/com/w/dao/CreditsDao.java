package com.w.dao;

import com.w.domain.Credits;
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
public interface CreditsDao {

//    添加
    @Insert("insert into credits(userID,credits) values(#{credits.userID},#{credits.credits})")
    int addCredits(Credits credits);

//    删除
    @Delete("delete from credits where creditsID = #{creditsID}")
    int deleteCredits(String creditsID);

//    更新
    @Update("update credits set "+
                "userID = #{credits.userID}, "+
                "credits = #{credits.credits} "+
                "where creditsID = #{credits.creditsID}")
    int updateCredits(Credits credits);

//    查询
    @Select("select * from credits where creditsID = #{creditsID}")
    List<Credits> findCreditsByID(String creditsID);

    @Select("select * from credits")
    List<Credits> findAllCredits();

//    查询总数
    @Select("select count(*) from credits")
    int countCreditsNum();
}
