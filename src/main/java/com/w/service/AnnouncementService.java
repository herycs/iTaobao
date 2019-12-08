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

    int addAnno(Announcement announcement) throws Exception;

    int deleteAnno(int Anno_ID) throws Exception;

    int updateAnno(Announcement announcement) throws Exception;

    List<Announcement> findAll() throws Exception;

    List<Announcement> findOneByID(int annoID) throws Exception;

}
