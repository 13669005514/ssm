package com.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.pojo.Emps;
import com.pojo.EmpsExample;





public interface EmpsMapper {
    int countByExample(EmpsExample example);

    int deleteByExample(EmpsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emps record);

    int insertSelective(Emps record);

    List<Emps> selectByExample(EmpsExample example);

    Emps selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emps record, @Param("example") EmpsExample example);

    int updateByExample(@Param("record") Emps record, @Param("example") EmpsExample example);

    int updateByPrimaryKeySelective(Emps record);

    int updateByPrimaryKey(Emps record);
}