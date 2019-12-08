package com.w.dao;

import com.w.domain.ProDetail;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassNamePro_detailDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:28
 * @Version V1.0
 **/
public interface ProDetailDao {

    @Insert("insert into pro_detail(pro_ID, detail_data, detail_class)" +
            "values(#{proDetail.pro_ID}, #{proDetail.detail_data}, #{proDetail.detail_class})")
    int addProDetail(@Param("proDetail") ProDetail proDetail) throws SQLException;

    @Delete("delete from pro_detail where pro_ID = #{proDetailID}")
    int deleteProDetail(int proDetailID) throws SQLException;

    @Update("update pro_detail set pro_ID = #{proDetail.pro_ID}, detail_data = #{proDetail.detail_data}, detail_class = #{proDetail.detail_class} where detail_ID = #{proDetail.detail_ID}")
    int updateProDetail(@Param("proDetail") ProDetail proDetail) throws SQLException;

    @Select("select * from pro_detail")
    List<ProDetail> findAllProDetail() throws SQLException;

}
