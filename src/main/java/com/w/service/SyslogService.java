package com.w.service;

import com.w.domain.Syslog;

import java.util.List;

/**
 * @ClassNameSylogService
 * @Description
 * @Author ANGLE0
 * @Date2019/11/20 20:35
 * @Version V1.0
 **/
public interface SyslogService {
    List<Syslog> findAll() throws Exception;
    int delSyslog(int syslogID) throws Exception;
    int addSyslog(Syslog syslog) throws Exception;
}
