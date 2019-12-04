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
    public int deleteAnno(int anno_ID) {
        int result1 = announcementDao.deleteAnnouncement(anno_ID);
        return result1;
    }

    @Override
    public int updateAnno(Announcement announcement) {
        int result2 = announcementDao.updateAnnouncement(announcement);
        return result2;
    }

    @Override
    public List<Announcement> findAll() {
        return (List<Announcement>)announcementDao.findAllAnnouncement();
    }

    @Override
    public List<Announcement> findOneByID(int annoID) {
//        从redis中查询
//        announcement = (List) redisTemplate.opsForValue().get("announcement_"+annoID);
//        System.out.println("redis查询");
//        if (announcement == null) {
//            System.out.println("数据库查询");
//            announcement = announcementDao.findAnnouncementByID(annoID);
////            存入session中并设置存货时间
//            redisTemplate.opsForValue().set("announcement_"+annoID, announcement, 10, TimeUnit.SECONDS);
//        }
        List<Announcement> announcement = null;
        announcement = announcementDao.findAnnouncementByID(annoID);
        return announcement;
    }
}
