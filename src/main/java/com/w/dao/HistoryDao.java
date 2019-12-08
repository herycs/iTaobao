package com.w.dao;

import com.w.domain.History;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassNameProductDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/26 12:35
 * @Version V1.0
 **/
@Repository
public interface HistoryDao {

//    添加历史记录
    @Insert("insert into history(userID,historyData) "+
            " values(#{history.userID},#{history.historyData}) ")
    int addHistory(@Param("history") History history) throws SQLException;

//    删除历史记录
    @Delete("delete from history where historyID = #{historyID}")
    int deleteHistory(int historyID) throws SQLException;

//    更新历史记录
    @Update("update history set "+
                "userID = #{history.userID}, "+
                "historyData = #{history.historyData} "+
                "where historyID = #{history.historyID}")
    int updateHistory(@Param("history") History history) throws SQLException;

//    查询历史记录
    @Select("select * from history where historyID = #{historyID}")
    List<History> findHistoryByID(int historyID) throws SQLException;

    @Select("select * from history")
    List<History> findAllHistory() throws SQLException;

//    查询历史记录总数
    @Select("select count(*) from history")
    int countHistoryNum() throws SQLException;
}
