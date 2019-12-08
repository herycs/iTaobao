package com.w.dao;

import com.w.domain.Announcement;
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
public interface AnnouncementDao {

//    添加
    @Insert("insert into announcement(annu_title, annu_image, annu_content, annu_time, annu_type, annu_preTime, annu_isTop, annu_state) " +
            "values(" +
            "#{announcement.annu_title}," +
            "#{announcement.annu_image}," +
            "#{announcement.annu_content}," +
            "#{announcement.annu_time}," +
            "#{announcement.annu_type}," +
            "#{announcement.annu_preTime}," +
            "#{announcement.annu_isTop}," +
            "#{announcement.annu_state}" +
            ")")
    int addAnnouncement(@Param("announcement") Announcement announcement) throws SQLException;

//    删除
    @Delete("delete from announcement where annu_ID = #{announcementID}")
    int deleteAnnouncement(int announcementID) throws SQLException;

//    更新
    @Update("update announcement set "+
                "annu_title = #{announcement.annu_title}, "+
                "annu_image = #{announcement.annu_image}, "+
                "annu_content = #{announcement.annu_content}, "+
                "annu_time = #{announcement.annu_time}, "+
                "annu_type = #{announcement.annu_type}, "+
                "annu_preTime = #{announcement.annu_preTime}, "+
                "annu_isTop = #{announcement.annu_isTop}, "+
                "annu_state = #{announcement.annu_state} "+
                "where annu_ID = #{announcement.annu_ID}")
    int updateAnnouncement(@Param("announcement") Announcement announcement) throws SQLException;

//    查询


    @Select("select * from announcement where annu_ID = #{announcementID}")
    List<Announcement> findAnnouncementByID(int announcementID) throws SQLException;

    @Select("select * from announcement")
    List<Announcement> findAllAnnouncement() throws SQLException;

//    查询总数
    @Select("select count(*) from announcement")
    int countAnnouncementNum() throws SQLException;
}
