package com.ssm.mapper;

import com.ssm.po.SysCreatecode;
import com.ssm.po.SysCreatecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCreatecodeMapper {
    int countByExample(SysCreatecodeExample example);

    int deleteByExample(SysCreatecodeExample example);

    int deleteByPrimaryKey(String createcodeId);

    int insert(SysCreatecode record);

    int insertSelective(SysCreatecode record);

    List<SysCreatecode> selectByExample(SysCreatecodeExample example);

    SysCreatecode selectByPrimaryKey(String createcodeId);

    int updateByExampleSelective(@Param("record") SysCreatecode record, @Param("example") SysCreatecodeExample example);

    int updateByExample(@Param("record") SysCreatecode record, @Param("example") SysCreatecodeExample example);

    int updateByPrimaryKeySelective(SysCreatecode record);

    int updateByPrimaryKey(SysCreatecode record);
}