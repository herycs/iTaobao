package com.w.dao;

import com.w.domain.Bus_detail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
public interface Bus_detailDao {

//    添加
    @Insert("insert into bus_detail(identfify_face,identfify_back) "+
            "values(#{bus_detail.identfify_face},#{bus_detail.identfify_back})")
    int addBus_detail(Bus_detail bus_detail) throws SQLException;

//    删除
    @Delete("delete from bus_detail where bus_detail_ID=#{bus_detailID}")
    int deleteBus_detail(String bus_detailID) throws SQLException;

//    更新信息
    @Update("update bus_detail set "+
            "identfify_face=#{bus_detail.identfify_face}, "+
            "identfify_back=#{bus_detail.identfify_back} "+
            "where bus_detail_ID = #{bus_detail.bus_detail_ID}")
    int updateBus_detail(Bus_detail bus_detail) throws SQLException;

//    查询
    @Select("select * from bus_detail where bus_detailID=#{bus_detailID}")
    List<Bus_detail> findBus_detailByID(String bus_detailID) throws SQLException;

    @Select("select * from bus_detail")
    List<Bus_detail> findAllBus_detail() throws SQLException;

//    查询商品总数
    @Select("select count(*) from bus_detail")
    int countBus_detailNum() throws SQLException;
}
