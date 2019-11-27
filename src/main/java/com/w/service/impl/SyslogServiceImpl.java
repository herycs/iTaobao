package com.w.service.impl;

import com.w.dao.SyslogDao;
import com.w.domain.Syslog;
import com.w.service.SyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNameSyslogServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/20 20:54
 * @Version V1.0
 **/
@Service("syslog")
public class SyslogServiceImpl implements SyslogService {

    @Autowired
    private SyslogDao syslogDao;

    @Override
    public List<Syslog> findAll() {
        List<Syslog> lists = syslogDao.findAllLogs();
        return lists;
    }

    @Override
    public int delSyslog(int syslogID) {
        int result = 0;
        result = syslogDao.delSyslog(syslogID);
        return result;
    }

    @Override
    public int addSyslog(Syslog syslog) {
        int result = syslogDao.addSyslog(syslog);
        return result;
    }
}
