package com.w.dao;

import com.w.domain.Announcement;
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
public interface AnnouncementDao {

//    添加
    @Insert("insert into announcement(annu_data) values(#{announcement.annu_data})")
    int addAnnouncement(@Param("announcement") Announcement announcement);

//    删除
    @Delete("delete from announcement where annu_ID = #{announcementID}")
    int deleteAnnouncement(int announcementID);

//    更新
    @Update("update announcement set "+
                "annu_data = #{announcement.annu_data} "+
                "where annu_ID = #{announcement.annu_ID}")
    int updateAnnouncement(@Param("announcement") Announcement announcement);

//    查询


    @Select("select * from announcement where annu_ID = #{announcementID}")
    List<Announcement> findAnnouncementByID(int announcementID);

    @Select("select * from announcement")
    List<Announcement> findAllAnnouncement();

//    查询总数
    @Select("select count(*) from announcement")
    int countAnnouncementNum();
}
