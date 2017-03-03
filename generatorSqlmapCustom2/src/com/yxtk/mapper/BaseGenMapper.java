package com.yxtk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseGenMapper<V extends R, R, E, P> {
    int countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(P id);

    int insert(R record);

    int insertSelective(R record);

    List<V> selectByExampleWithBLOBs(E example);

    List<V> selectByExample(E example);

    R selectByPrimaryKey(P id);

    int updateByExampleSelective(@Param("record") R record, @Param("example") E example);

    int updateByExampleWithBLOBs(@Param("record") R record, @Param("example") E example);

    int updateByExample(@Param("record") R record, @Param("example") E example);

    int updateByPrimaryKeySelective(R record);

    int updateByPrimaryKeyWithBLOBs(R record);

    int updateByPrimaryKey(R record);
}