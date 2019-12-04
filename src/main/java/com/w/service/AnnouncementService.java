package com.w.service;

import com.w.domain.Announcement;

import java.util.List;

/**
 * @ClassNameAnnouncementService
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 8:13
 * @Version V1.0
 **/
public interface AnnouncementService {

    int addAnno(Announcement announcement);

    int deleteAnno(int Anno_ID);

    int updateAnno(Announcement announcement);

    List<Announcement> findAll();

    List<Announcement> findOneByID(int annoID);

}
