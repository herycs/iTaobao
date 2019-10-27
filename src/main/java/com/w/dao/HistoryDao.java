package com.w.dao;

import com.w.domain.History;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

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
    int addHistory(History history);

//    删除历史记录
    @Delete("delete from history where historyID = #{historyID}")
    int deleteHistory(String historyID);

//    更新历史记录
    @Update("update history set "+
                "userID = #{history.userID}, "+
                "fav_name = #{history.fav_name}, "+
                "historyData = #{history.historyData} "+
                "where historyID = #{history.historyID}")
    int updateHistory(History history);

//    查询历史记录
    @Select("select * from history where historyID = #{historyID}")
    List<History> findHistoryByID(String historyID);

    @Select("select * from history")
    List<History> findAllHistory();

//    查询历史记录总数
    @Select("select count(*) from history")
    int countHistoryNum();
}
