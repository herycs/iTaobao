package com.w.dao;

import com.w.domain.Repertory;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.sql.SQLException;
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
    @Insert("insert into repertory(pro_ID, repe_num, damage_num, increase_num, back_num, change_time, u_id) " +
            "values(#{repertory.pro_ID}, " +
            "#{repertory.repe_num}, " +
            "#{repertory.damage_num}, " +
            "#{repertory.increase_num}, " +
            "#{repertory.back_num}, " +
            "#{repertory.change_time}, " +
            "#{repertory.u_id} " +
            ")")
    int addRepertory(@Param("repertory") Repertory repertory) throws SQLException;

    //修改库存
    @Update("update repertory set " +
            "pro_ID = #{repertory.repe_num}, " +
            "pro_ID = #{repertory.damage_num}, " +
            "pro_ID = #{repertory.increase_num}, " +
            "pro_ID = #{repertory.back_num}, " +
            "pro_ID = #{repertory.change_time}, " +
            "pro_ID = #{repertory.u_id} " +
            "where pro_ID = #{repertory.pro_ID} and pro_ID = #{repertory.repe_ID}")
    int updateRepertory(@Param("repertory")Repertory repertory) throws SQLException;

    //删除库存记录
    @Delete("delete from repertory where repe_ID = #{repeID}")
    int deleteRepertory(int repeID) throws SQLException;

    //查询所有库存
    @Select("select * from repertory")
    List<Repertory> findAll() throws SQLException;

    //查询指定库存
    @Select("select * from repertory where pro_ID = #{proID}")
    List<Repertory> findRepertoryByProID(int proID) throws SQLException;
}
