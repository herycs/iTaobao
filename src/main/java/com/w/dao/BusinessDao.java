package com.w.dao;

import com.w.domain.Business;
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
public interface BusinessDao {

//    添加
    @Insert("insert into business(bus_detail_ID, bus_Name,bus_address,bus_phone,bus_email,bus_people)" +
            " values(#{business.bus_detail_ID}, #{business.bus_Name}, #{business.bus_address}, #{business.bus_phone}, #{business.bus_email}, #{business.bus_people})")
    int addBusiness(@Param("business") Business business);

//    删除
    @Delete("delete from business where bus_ID = #{bus_ID}")
    int deleteBusiness(int bus_ID);

//    更新信息
    @Update("update business set " +
            "bus_detail_ID = #{business.bus_detail_ID}," +
            "bus_Name = #{business.bus_Name}," +
            "bus_address = #{business.bus_address}," +
            "bus_phone = #{business.bus_phone}," +
            "bus_email = #{business.bus_email}, "+
            "bus_people = #{business.bus_people} "+
            "where bus_ID = #{business.bus_ID}")
    int updateProduct(@Param("business") Business business);

//    查询
    @Select("select * from business where bus_Name = #{businessName}")
    List<Business> findBusinessByName(String businessName);

    @Select("select * from business where bus_ID = #{businessID}")
    List<Business> findBusinessByID(String businessID);

    @Select("select * from business")
    List<Business> findAllBusiness();

//    查询总数
    @Select("select count(*) from business")
    int countBusinessNum();
}
