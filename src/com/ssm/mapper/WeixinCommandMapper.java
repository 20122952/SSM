package com.ssm.mapper;

import com.ssm.po.WeixinCommand;
import com.ssm.po.WeixinCommandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinCommandMapper {
    int countByExample(WeixinCommandExample example);

    int deleteByExample(WeixinCommandExample example);

    int deleteByPrimaryKey(String commandId);

    int insert(WeixinCommand record);

    int insertSelective(WeixinCommand record);

    List<WeixinCommand> selectByExample(WeixinCommandExample example);

    WeixinCommand selectByPrimaryKey(String commandId);

    int updateByExampleSelective(@Param("record") WeixinCommand record, @Param("example") WeixinCommandExample example);

    int updateByExample(@Param("record") WeixinCommand record, @Param("example") WeixinCommandExample example);

    int updateByPrimaryKeySelective(WeixinCommand record);

    int updateByPrimaryKey(WeixinCommand record);
}