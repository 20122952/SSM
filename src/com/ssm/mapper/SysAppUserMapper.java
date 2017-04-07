package com.ssm.mapper;

import com.ssm.po.SysAppUser;
import com.ssm.po.SysAppUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAppUserMapper {
    int countByExample(SysAppUserExample example);

    int deleteByExample(SysAppUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(SysAppUser record);

    int insertSelective(SysAppUser record);

    List<SysAppUser> selectByExample(SysAppUserExample example);

    SysAppUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SysAppUser record, @Param("example") SysAppUserExample example);

    int updateByExample(@Param("record") SysAppUser record, @Param("example") SysAppUserExample example);

    int updateByPrimaryKeySelective(SysAppUser record);

    int updateByPrimaryKey(SysAppUser record);
}