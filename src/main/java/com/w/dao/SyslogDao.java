package com.w.dao;

import com.w.domain.Syslog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassNameSyslogDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:31
 * @Version V1.0
 **/
public interface SyslogDao {

    //查找所有日志
    @Select("select * from syslog")
    List<Syslog> findAllLogs();

}
