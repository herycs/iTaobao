package com.w.dao;

import com.w.domain.Repertory;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * @ClassNameRepertory
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:30
 * @Version V1.0
 **/
public interface RepertoryDao {

    //增加库存
    @Insert("insert into repertory(pro_ID, repe_num) values(#{repertory.pro_ID}, #{repertory.repe_num})")
    int addRepertory(@Param("repertory") Repertory repertory);

    //修改库存
    @Update("update repertory set repe_num = #{repeNum} where pro_ID = #{proID}")
    int updateRepertory(int repeNum,int proID);

    //删除库存记录
    @Delete("delete from repertory where repe_ID = #{repeID}")
    int deleteRepertory(int repeID);

    //查询所有库存
    @Select("select * from repertory")
    List<Repertory> findAll();

    //查询指定库存
    @Select("select * from repertory where pro_ID = #{proID}")
    List<Repertory> findRepertoryByProID(int proID);
}
