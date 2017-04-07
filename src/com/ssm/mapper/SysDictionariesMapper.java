package com.ssm.mapper;

import com.ssm.po.SysDictionaries;
import com.ssm.po.SysDictionariesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictionariesMapper {
    int countByExample(SysDictionariesExample example);

    int deleteByExample(SysDictionariesExample example);

    int deleteByPrimaryKey(String dictionariesId);

    int insert(SysDictionaries record);

    int insertSelective(SysDictionaries record);

    List<SysDictionaries> selectByExample(SysDictionariesExample example);

    SysDictionaries selectByPrimaryKey(String dictionariesId);

    int updateByExampleSelective(@Param("record") SysDictionaries record, @Param("example") SysDictionariesExample example);

    int updateByExample(@Param("record") SysDictionaries record, @Param("example") SysDictionariesExample example);

    int updateByPrimaryKeySelective(SysDictionaries record);

    int updateByPrimaryKey(SysDictionaries record);
}