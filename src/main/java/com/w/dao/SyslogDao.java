package com.w.dao;

import com.w.domain.Syslog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.parameters.P;

import java.sql.SQLException;
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
    List<Syslog> findAllLogs() throws SQLException;

    @Delete("delete from syslog where logID = #{syslogID}")
    int delSyslog(int syslogID) throws SQLException;

    @Insert("insert into syslog(username, visitTime, ip, url, excutionTime, method)" +
            "values(" +
                "#{syslog.username}," +
                "#{syslog.visitTime}," +
                "#{syslog.ip}," +
                "#{syslog.url}," +
                "#{syslog.excutionTime}," +
                "#{syslog.method}" +
            ")")
    int addSyslog(@Param("syslog") Syslog syslog) throws SQLException;
}
