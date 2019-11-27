package com.w.service.impl;

import com.w.dao.AnnouncementDao;
import com.w.domain.Announcement;
import com.w.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AnnouncementServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 8:13
 * @Version V1.0
 **/
@Service("annoService")
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementDao announcementDao;

    @Override
    public int addAnno(Announcement announcement) {
        int result = announcementDao.addAnnouncement(announcement);
        return result;
    }

    @Override
    public int deleteAnno(String Anno_ID) {
        int result1 = announcementDao.deleteAnnouncement(Integer.parseInt(Anno_ID));
        return result1;
    }

    @Override
    public int updateAnno(Announcement announcement) {
        int result2 = announcementDao.updateAnnouncement(announcement);
        return result2;
    }

    @Override
    public List<Announcement> findAll() {
        List<Announcement> announcementList = announcementDao.findAllAnnouncement();
        return announcementList;
    }

    @Override
    public List<Announcement> findOneByID(Announcement announcement) {
        return null;
    }
}
