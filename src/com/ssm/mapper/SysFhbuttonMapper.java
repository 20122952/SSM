package com.ssm.mapper;

import com.ssm.po.SysFhbutton;
import com.ssm.po.SysFhbuttonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFhbuttonMapper {
    int countByExample(SysFhbuttonExample example);

    int deleteByExample(SysFhbuttonExample example);

    int deleteByPrimaryKey(String fhbuttonId);

    int insert(SysFhbutton record);

    int insertSelective(SysFhbutton record);

    List<SysFhbutton> selectByExample(SysFhbuttonExample example);

    SysFhbutton selectByPrimaryKey(String fhbuttonId);

    int updateByExampleSelective(@Param("record") SysFhbutton record, @Param("example") SysFhbuttonExample example);

    int updateByExample(@Param("record") SysFhbutton record, @Param("example") SysFhbuttonExample example);

    int updateByPrimaryKeySelective(SysFhbutton record);

    int updateByPrimaryKey(SysFhbutton record);
}