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

    public int addAnno(Announcement announcement);

    public int deleteAnno(String Anno_ID);

    public int updateAnno(Announcement announcement);

    public List<Announcement> findAll();

    public List<Announcement> findOneByID(Announcement announcement);

}
