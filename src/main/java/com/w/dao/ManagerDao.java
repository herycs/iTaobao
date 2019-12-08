package com.w.dao;

import com.w.domain.Manager;
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
public interface ManagerDao {

//    添加管理员
    @Insert("insert into manager(man_username,man_name,man_password) "+
            " values(" +
                "#{manager.man_username}" +
                ",#{manager.man_name}" +
                ",#{manager.man_password}" +
            ")")
    int addManager(@Param("manager") Manager manager) throws SQLException;

//    删除管理员
    @Delete("delete from manager where man_ID = #{man_ID}")
    int deleteManager(int man_ID) throws SQLException;

//    更新管理员信息
    @Update("update manager set "+
                "man_username = #{manager.man_username}, "+
                "man_name = #{manager.man_name}, "+
                "man_password = #{manager.man_password} "+
                "where man_ID = #{manager.man_ID}")
    int updateManager(@Param("manager")Manager manager) throws SQLException;

//    查询管理员

    @Select("select * from manager where man_name = #{man_name}")
    List<Manager> findManagerByName(String  man_name) throws SQLException;


    @Select("select * from manager where man_ID = #{managerID}")
    List<Manager> findManagerByID(int managerID) throws SQLException;

    @Select("select * from manager")
    List<Manager> findAllManager() throws SQLException;

//    查询管理员总数
    @Select("select count(*) from manager")
    int countManagerNum() throws SQLException;
}
